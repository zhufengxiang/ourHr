//这是一个简历的实体类
package com.anping.po;

import java.util.Date;

import com.ourHr.chengshide.po.Department;
import com.ourHr.wuliang.po.Position;

public class Resume {
    private  int  id;
    private  int  state; //简历的状态
    private  Date  releaseTime;//简历发布的时间
    private  String employName;//求职者姓名
    private  Department department;//应聘者应聘的部门
    private  Position   postion;//应聘者应聘的职位
    private  String sex;//性别
    private  String  nationlity;//国籍
    private  String  phontoUrl;//照片地址
    private  String  employType;//招聘类型
    private  String  address;//地址
    private  String  post;//邮编
    private  String  telphone;//电话
    private  String familyPhone ;//家庭号码
    private  String email;//电子邮件
    private  String enjoy;//兴趣爱好
    private  String speciality;//特长
    private  String faith;//宗教信仰
    private  int age;//
    private  String degree;//教育程度
    private  int educateAge;//教育年限
    private  String major;//专业
    private  String graducateSchool;//毕业院校
    private  String idCard;//生分证
    private  String birthAddress;//出生地
    private  int  exceptedSalay;//期望的薪酬
    private  Date birthday;//出生日期
    private  String  personExperience;//个人经历
    private  String   remaker;//备注
    private  String filesAdress;//档案附件地址
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public String getEmployName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Position getPostion() {
		return postion;
	}
	public void setPostion(Position postion) {
		this.postion = postion;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNationlity() {
		return nationlity;
	}
	public void setNationlity(String nationlity) {
		this.nationlity = nationlity;
	}
	public String getPhontoUrl() {
		return phontoUrl;
	}
	public void setPhontoUrl(String phontoUrl) {
		this.phontoUrl = phontoUrl;
	}
	public String getEmployType() {
		return employType;
	}
	public void setEmployType(String employType) {
		this.employType = employType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getFamilyPhone() {
		return familyPhone;
	}
	public void setFamilyPhone(String familyPhone) {
		this.familyPhone = familyPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEnjoy() {
		return enjoy;
	}
	public void setEnjoy(String enjoy) {
		this.enjoy = enjoy;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getFaith() {
		return faith;
	}
	public void setFaith(String faith) {
		this.faith = faith;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getEducateAge() {
		return educateAge;
	}
	public void setEducateAge(int educateAge) {
		this.educateAge = educateAge;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGraducateSchool() {
		return graducateSchool;
	}
	public void setGraducateSchool(String graducateSchool) {
		this.graducateSchool = graducateSchool;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getBirthAddress() {
		return birthAddress;
	}
	public void setBirthAddress(String birthAddress) {
		this.birthAddress = birthAddress;
	}
	public int getExceptedSalay() {
		return exceptedSalay;
	}
	public void setExceptedSalay(int exceptedSalay) {
		this.exceptedSalay = exceptedSalay;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPersonExperience() {
		return personExperience;
	}
	public void setPersonExperience(String personExperience) {
		this.personExperience = personExperience;
	}
	public String getRemaker() {
		return remaker;
	}
	public void setRemaker(String remaker) {
		this.remaker = remaker;
	}
	public String getFilesAdress() {
		return filesAdress;
	}
	public void setFilesAdress(String filesAdress) {
		this.filesAdress = filesAdress;
	}
    
    
    
    
    
    
    
    
    
    
    
}
