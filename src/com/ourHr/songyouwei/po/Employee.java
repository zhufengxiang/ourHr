//所有员工的实体类
//关联的有人员和角色
//它和角色应该是多对多的关系
package com.ourHr.songyouwei.po;

 
import java.util.HashSet;
import java.util.Set;

import com.ourHr.hehui.po.Record;
import com.ourHr.hehui.po.Role;

public class Employee {
      private int  id ;
      private Record member;//人员
      private int  status;//账户状态
      private Record  modifyMember;//变更人员
      private  Set<Role>  roles   = new HashSet<Role>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Record getMember() {
		return member;
	}
	public void setMember(Record member) {
		this.member = member;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Record getModifyMember() {
		return modifyMember;
	}
	public void setModifyMember(Record modifyMember) {
		this.modifyMember = modifyMember;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	 
      
} 
