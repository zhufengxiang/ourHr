package com.anping.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
     
	public   String showUsers(){
    	  System.out.println("122121");
    	  return  SUCCESS;
      }
	public   String add(){
  	  System.out.println("10000000");
  	  return  SUCCESS;
    }
}
