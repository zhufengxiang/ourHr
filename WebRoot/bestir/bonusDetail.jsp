<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../css/001/style.css" />
</head>
<body>
	<div class="title"> 
			当前位置：管理首页 &gt;激励管理 &gt; 激励详细 
	</div>
	<div class="list">
		<table cellspacing="1" class="tablesorter" border="1" id="myTable">            
			<tr class="title">
				<td>
					受激励人
				</td>
				<td>
					激励项目
				</td>
				<td>
					激励等级
				</td>
				<td>
					状态
				</td>
				<td>
					激励价值
				</td>
				<td>
					登记时间
				</td>
			</tr>
			<tr>
				<td>
					${bonus.humanArchive.humanName }
				</td>
				<td>
					${bonus.bonusItem}
				</td>
				<td>
					${bonus.bonusDegree}
				</td>
				<td>
					<img src="../images/status${bonus.checkStatus }.gif" />
				</td>
				<td>
					￥ ${bonus.bonusWorth }
				</td>
				<td>
					<bean:write name="bonus" property="registTime" format="yyyy-MM-dd HH:mm:ss" />
				</td>
			</tr>
		</table><br/>
		<div align="center">
			<input type="button" value="返回" onClick="JScript:history.back()"/>
		</div>
	</div>
</body>
</html>