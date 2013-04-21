show tables;
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
	 
	 
	 	private int id;
	   private String nums;//编号与id的不同，编号确定职务：部门经理   副经理  主管  普通人员 四个级别可以用 （1001表示）
//	   private Set<Department> Department =new HashSet<Department>();//部门的id（外键）
//	   本来以为部门表与职位表有相关系，比如招聘是说 人事部经理，却可以这样分 人事部   经理
	   private String username; //职位名称
	   private String explains;// 职位说明
	   private String standara;//职位规范
	   private String booker;//登记人
	   private Date oldDate;//部门创建时间
	   private String changer;//变更人
	   private Date newDate;//变更时间	
	   
	   
	       private  int id ;
    private Resume resume;//简历的ID
    private int state;//赛选的结果
    private int interNum;//面试次数
    private  int writternNum;//笔试次数
    private  int writternPoint; //笔试分数
    private  String opinion;//简历推荐意见