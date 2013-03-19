package Utils;

 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anping.po.Depart;
import com.anping.service.DepartService;
import com.anping.service.impl.DepartServiceImpl;

public class Start    implements HttpSessionListener   {
	 
	public void sessionCreated(HttpSessionEvent arg0) {
		 // 前提是搜索  数据库中是否已经有值  有的话就不需要在去加了
	 	  //在此处将数据加载
	      ApplicationContext    apcp   =         new  	ClassPathXmlApplicationContext("applicationContext.xml");
	      DepartService  service  = apcp.getBean("DepartService", DepartService.class);
	   if(service.getDeparts(0, 10, 0)!=null){
		   return ;
	   }
   	 System.out.println("数据录入开始");
   	 Depart    depart = new   Depart(); 
   	 Depart  parent   =null;
   	  SAXReader     reader   =  new  SAXReader();
   	   Document   document   =  null;
   	     try {
					document   =     reader.read(Start.class.getClassLoader().getResourceAsStream("../data.xml"));
				} catch (DocumentException e) {
				 	e.printStackTrace();
			  	}
         //拿到文档中的根节点 
   	      Element    root   = 	   document.getRootElement();
   	      //拿到根节点中的元素
   	      
   	 
         Iterator<Element>	 a   =   root.elementIterator();
          Element el  = null;
          Element el2  = null;
          Iterator<Element>  b  = null;
          Iterator<Element>  d  = null;
          List<Object>  params   =  null;
      
          int   i = 0 ;
         while(a.hasNext()){   //第一次迭代的是根
        	
        	 el = a.next();  
     		  b  = el.elementIterator();
     		   while(b.hasNext()){  //第二次是迭代Departs  
			     			 el2  = b.next();   //拿到的是Depart
			     		  	depart.setText(el2.attributeValue("text"));
			     			depart.setLeaf(Integer.parseInt(el2.attributeValue("leaf")));
			     			depart.setChecked(Integer.parseInt(el2.attributeValue("checked")));
			     			depart.setExpandable(Integer.parseInt(el2.attributeValue("expandable")));
			     	        depart.setExpanded(Integer.parseInt(el2.attributeValue("expanded")));
			     	        if(el2.attributeValue("url")!=null){
			     	        	depart.setUrl(el2.attributeValue("url"));
			     	        }
			     	       if(el2.attributeValue("sort")!=null){
			     	        	depart.setSort(Integer.parseInt(el2.attributeValue("sort")));
			     	        }
			     	        
			     	        if(el2.attributeValue("parent")!=null){
			     	        	  //先去查找出parent  在添加进来
			     	       	params  = new ArrayList<Object>();
			     	        	params.add(el2.attributeValue("parent"));
			     	        	if(parent==null ){
			     	        		parent= 	service.getDepart( "text=?",params);
			     	        	}else   {
			     	        		if (! parent.getText().equals(el2.attributeValue("parent"))){
			     	        		 parent= 	service.getDepart( "text=?",params);}
			     	        	}
			     	        	   
			     	        	depart.setParent(parent);
			     	          }  
			     	        service.addDepart(depart); 
			     	    
			     	           
			     	     if(i==20){
		     	              service.flush();  //刷 
			     	     }

				             i++;
			     	     
			     	       
     		  }
         }
         System.out.println("数据录入结束");

	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
	 
	}

}
