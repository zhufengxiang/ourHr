//职位的实体表
 //关联有 员工 部门
package com.ourHr.wuliang.po;

import java.util.Date;

import com.ourHr.chengshide.po.Department;
import com.ourHr.songyouwei.po.Employee;

public class Position {
	   private int id;
       private  int number;//职位的编号  
       private  Department department ;//职位所在部门
       private String name ;//部门的名字
       private String explain;//部门的说明
       private String   standard ; //部门的规范
       private Employee createMan;//登记人
       private Date  createTime;//部门创建时间
       private  String  updateMan; //变更人
       private  Date   updateTime;//部门便跟时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Employee getCreateMan() {
		return createMan;
	}
	public void setCreateMan(Employee createMan) {
		this.createMan = createMan;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateMan() {
		return updateMan;
	}
	public void setUpdateMan(String updateMan) {
		this.updateMan = updateMan;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
       
}
