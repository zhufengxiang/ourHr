package com.ourHr.wuliang.po;

import java.io.Serializable;
import java.util.Date;

import com.ourHr.chengshide.po.Department;
import com.ourHr.shaotingting.po.Salary;


public class PositionMove implements Serializable{

	 /**
	 * 职位调动实例,向关联是部门表，人员档案表，职务表
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	 private Salary salary;//薪资表
	 private Position posistion;//职位id
	 private Department department;//部门
	 private int nums;//招聘人数
	 private String types;//招聘类型(校园招聘   社会招聘)
	 private String moveDesc;//调动原因
	 private String necessary;//招聘要求
	 private String booker;//最初增加调动人
	 private Date oldDate;//最初增加调动的时间    
	 private String checker;//审核的人
	 private Date checkDate;//审核的时间
	 private String remark;//审核意见
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
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
	public String getMoveDesc() {
		return moveDesc;
	}
	public void setMoveDesc(String moveDesc) {
		this.moveDesc = moveDesc;
	}
	public String getNecessary() {
		return necessary;
	}
	public void setNecessary(String necessary) {
		this.necessary = necessary;
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
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
