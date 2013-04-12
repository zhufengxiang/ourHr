package com.anping.po;

import com.ourHr.hehui.po.Record;

public class Leave {
     private  int id;
     //工号
     private  Record record;
    //请假天数
     private  int day;
     //理由
     private  String reason;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}


   
}
