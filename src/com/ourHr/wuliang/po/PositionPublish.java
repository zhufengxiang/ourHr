package com.ourHr.wuliang.po;

import java.io.Serializable;
import java.util.Date;

import com.ourHr.chengshide.po.Department;

//职位发布实例
public class PositionPublish implements Serializable{

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int  id;
	 private Position posistion;//职位
	 private Department department;//部门
	 private int nums;//招聘人数
	 private String types;//招聘类型(校园招聘   社会招聘)
	 private String descs;//职位描述
	 private String necessary;//招聘要求
	 private Date deadtime;// 截止日期
	 private String booker;//最初登记招聘信息人
	 private Date oldDate;//最初登记招聘信息的时间   
	 private String changer;//修改此登记招聘信息的人
	 private Date newDate;//变更时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Position getPosistion() {
		return posistion;
	}
	public void setPosistion(Position posistion) {
		this.posistion = posistion;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getDescs() {
		return descs;
	}
	public void setDescs(String descs) {
		this.descs = descs;
	}
	public String getNecessary() {
		return necessary;
	}
	public void setNecessary(String necessary) {
		this.necessary = necessary;
	}
	public Date getDeadtime() {
		return deadtime;
	}
	public void setDeadtime(Date deadtime) {
		this.deadtime = deadtime;
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
