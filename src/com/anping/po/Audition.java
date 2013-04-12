//面试的筛选记录
package com.anping.po;

public class Audition {
    private  int id ;
    private Resume resume;//简历的ID
    private int state;//赛选的结果
    private int interNum;//面试次数
    private  int writternNum;//笔试次数
    private  int writternPoint; //笔试分数
    private  String opinion;//简历推荐意见
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
	public int getInterNum() {
		return interNum;
	}
	public void setInterNum(int interNum) {
		this.interNum = interNum;
	}
	public int getWritternNum() {
		return writternNum;
	}
	public void setWritternNum(int writternNum) {
		this.writternNum = writternNum;
	}
	public int getWritternPoint() {
		return writternPoint;
	}
	public void setWritternPoint(int writternPoint) {
		this.writternPoint = writternPoint;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
   
}
