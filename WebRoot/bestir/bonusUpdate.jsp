<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../css/001/style.css" />
	<script type='text/javascript' src='../dwr/interface/service.js'></script>
 	<script type='text/javascript' src='../dwr/engine.js'></script>
	<script type='text/javascript' src='../dwr/util.js'></script>
	<script type="text/javascript" src="../js/preferment/bonus_add.js"></script>
</head>
<body>
		<div class="title">
			当前位置：管理首页 &gt;激励管理 &gt;修改激励
		</div>
		<div class="main_input">
			<html:form action="bonus/bonusDo.do?commend=updateBonus&bonusId=${bonus.bonusId}"
				method="post" styleId="form1">
				<div class="content">
					<table cellspacing="0" cellpadding="0">
						<tr>
							<td width="489" colspan="5">
								<table width="100%" cellpadding="0" cellspacing="0">
<tr>
										<td width="5%" class="tdbg1">
											部门名称：
										</td>
										<td width="24%">
											<select name="deptId" id="selectDeptId" onChange="chooseHumanArchive(this.value)">
									 	
											</select>
										</td>
										<td width="11%" class="tdbg1">
											被激励人：
										</td>
										<td width="24%">
											<select name="humanId" id="selectHumanId">
									
											</select>
										</td>
										<td width="12%" class="tdbg1">
											激励项目：
										</td>
										<td width="30%">
											<html:text property="bonusItem" value="${bonus.bonusItem}" />
										</td>
									</tr>
									<tr>
										<td class="tdbg1">
											激励价值：
											<br>
										</td>
										<td>
											<html:text property="bonusWorth" styleClass="inp1"
												value="${bonus.bonusWorth}" />
											元
										</td>
										<td class="tdbg1">
											激励等级：
											<br>
										</td>
										<td>
											<html:text property="bonusDegree" value="${bonus.bonusDegree}" />
										</td>
									</tr>
									<tr>
										<td class="tdbg1">
											备 注：
											<br>
										</td>
										<td colspan="3">
											<html:textarea property="remark" styleClass="texta2"
												value="${bonus.remark}"></html:textarea>
										</td>
									</tr>
									<tr align="center" bgcolor="#F1F2FE">
										<td colspan="4">
											<html:submit styleClass="btn">保存</html:submit>
											<html:reset styleClass="btn">重置</html:reset>
                                            <html:subimt styleClass="btn">返回</html:reset>
										</td>
									</tr>
								</table>
						  </td>
					  </tr>
					</table>
				</div>
			</html:form>
		</div>
	</body>
</html>