//面试 记录  应聘者应聘之后的结果
package com.anping.po;

public class AuditionRecord {
  private  int id ;
  private  Resume resume;//简历
  private  int state;//审核状态
  private  String imageLevel;//形象等级
  private  int  speechLevel;//口才等级
  private  String forigenLevel;//外语水平
  private  int strainCapacity;//应变能力
  private  int EQLevel;//EQ等级
  private   int IQLevel;//iq等级
  private   int overallQuality;//综合素质
  private  String  opinion;//面试评价
  private  int status;//面试记录的状态
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Resume getResume() {
	return resume;
}
public void setResume(Resume resume) {
	this.resume = resume;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
public String getImageLevel() {
	return imageLevel;
}
public void setImageLevel(String imageLevel) {
	this.imageLevel = imageLevel;
}
public int getSpeechLevel() {
	return speechLevel;
}
public void setSpeechLevel(int speechLevel) {
	this.speechLevel = speechLevel;
}
public String getForigenLevel() {
	return forigenLevel;
}
public void setForigenLevel(String forigenLevel) {
	this.forigenLevel = forigenLevel;
}
public int getStrainCapacity() {
	return strainCapacity;
}
public void setStrainCapacity(int strainCapacity) {
	this.strainCapacity = strainCapacity;
}
public int getEQLevel() {
	return EQLevel;
}
public void setEQLevel(int eQLevel) {
	EQLevel = eQLevel;
}
public int getIQLevel() {
	return IQLevel;
}
public void setIQLevel(int iQLevel) {
	IQLevel = iQLevel;
}
public int getOverallQuality() {
	return overallQuality;
}
public void setOverallQuality(int overallQuality) {
	this.overallQuality = overallQuality;
}
public String getOpinion() {
	return opinion;
}
public void setOpinion(String opinion) {
	this.opinion = opinion;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
  
}
