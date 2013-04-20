//职位的实体表
 //关联有 员工 部门
package com.ourHr.wuliang.po;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.ourHr.chengshide.po.Department;

public class Position implements Serializable{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	   private String nums;//编号与id的不同，编号确定职务：部门经理   副经理  主管  普通人员 四个级别可以用 （1001表示）
//	   private Set<Department> Department =new HashSet<Department>();//部门的id（外键）
//	   本来以为部门表与职位表有相关系，比如招聘是说 人事部经理，却可以这样分 人事部   经理
	   private String name; //职位名称
	   private String explain;// 职位说明
	   private String standara;//职位规范
	   private String booker;//登记人
	   private Date oldDate;//部门创建时间
	   private String changer;//变更人
	   private Date newDate;//变更时间	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	 
    
	
	public String getNums() {
		return nums;
	}
	public void setNums(String nums) {
		this.nums = nums;
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
	public String getStandara() {
		return standara;
	}
	public void setStandara(String standara) {
		this.standara = standara;
	}
	public String getBooker() {
		return booker;
	}
	public void setBooker(String booker) {
		this.booker = booker;
	}
	public Date getOldDate() {
		return oldDate;
	}
	public void setOldDate(Date oldDate) {
		this.oldDate = oldDate;
	}
	public String getChanger() {
		return changer;
	}
	public void setChanger(String changer) {
		this.changer = changer;
	}
	public Date getNewDate() {
		return newDate;
	}
	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	   
}
