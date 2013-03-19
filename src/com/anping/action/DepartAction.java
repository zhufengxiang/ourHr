package com.anping.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import Utils.CommandDepartUtil;

import com.anping.po.Depart;
import com.anping.po.QueryResult;
import com.anping.service.DepartService;
import com.ext.po.Depart4Ext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
 
@Controller("de")
 public class DepartAction extends ActionSupport  implements  ModelDriven<Depart>  {
 
	
    //这是显示部门的
	public String getAllDeparts() {
 
   		//从后台中拿到查询到的数据
    	  
    	      QueryResult  queryResult = 	departService.getDeparts(firstIndex,maxSize,pid);
              
             //诺从后台拿到的数据为空的时候  ,我们直接返回 否则去对数据矫正
             if(queryResult==null) 
            	 items=null;
             else  
              items  =  queryResult.getResults();  
             System.out.println("what is the matter");      
          System.out.println(items.get(0).getChildren().size());
		 return SUCCESS;
	}
	
	

	public List<Depart> getItems() {
		return items;
	}

	public void setItems(List<Depart> items) {
		this.items = items;
	}

 

     @Resource(name="DepartService")
	public void setDepartService(DepartService departService) {
		this.departService = departService;
	}
     
    
	 
  
	
	 public void setPid(int pid) {
		this.pid = pid;
	}


	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}


	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}


	 private  int firstIndex;
	 private int maxSize;
	 private  int pid;
	 private List<Depart> items=   new ArrayList<Depart>();;
	 private Depart depart;
	 private  DepartService departService;
	 public Depart getModel() {
    	return depart;
	}
}
