package com.anping.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anping.basic.DaoSupport;
import com.anping.po.Depart;
import com.anping.po.QueryResult;
import com.anping.service.DepartService;
@Service("DepartService")
@Transactional(propagation=Propagation.REQUIRED)
public class DepartServiceImpl  extends DaoSupport implements DepartService {
      
	public void flush() {
	 
       this.flushData();//  不要和子类去一样的名字 因为重写的概念不懂吗
	}
	public void addDepart(Depart  depart ) {
	     this.save(depart);
	     
	}

	public void deleteDepart(Depart depart) {
		 this.delete(Depart.class, (int)depart.getId());
	}

	public QueryResult getDeparts(int firstIndex,
			int maxResult,int pid  ) {
		
		 String	   sql_where   =  "parent=?";
		 LinkedHashMap<String, String> orderBy  = new LinkedHashMap<String, String>();
		 orderBy.put("sort", "asc");
		 List<Object> parames   ;
		 if(pid==0){
			 sql_where  = "parent is null";
			 parames  =  null;
		 }else{
			 parames = new ArrayList<Object>();
			 parames.add(pid);
      }
	     return this.getAllEntity(Depart.class, firstIndex,maxResult,orderBy, sql_where, parames);
	}

	public void updateDepart(Depart depart) {
		  this.update(depart);
	}

	public Depart getDepart(String sql_where, List<Object> parames) {
 
	    return 	this.getEntitiy(Depart.class, sql_where, parames);
	}

	

}
