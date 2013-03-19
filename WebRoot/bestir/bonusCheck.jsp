<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="../css/001/style.css" />
	<script type="text/javascript" src="../js/page.js"></script>
	<script type="text/javascript" language="javascript" src="../js/bonusCheckbox.js"></script>
	<title>激励管理审核页面</title>
</head>
<body>
		<div class="title">
			当前位置：管理首页&gt; 激励管理&gt; 激励列表
		</div>
		<div class="list">
			<form action="bonusDo.do?commend=findCheckBonus" method="post">
				<input type="hidden" name="page">
			</form>
			<html:form action="bonus/bonusDo.do?commend=findAllBonus" method="post" styleId="form1">
				<table width="200" cellspacing="0" cellpadding="0">
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
							激励时间
						</td>
						<td>
							详细
						</td>
						<td>
							操作
						</td>
					</tr>
					<logic:empty name="pageView">
						<tr>
							<td colspan="8" style="color: #ff0000">
								暂时没有任何激励记录!
							</td>
						</tr>
					</logic:empty>
					<logic:notEmpty name="pageView">
						<logic:iterate id="a" name="pageView" property="records" indexId="index">
							<tr>
								<td>
									${a.humanArchive.humanName}
								</td>
								<td>
									${a.bonusItem}
								</td>
								<td>
									${a.bonusDegree}
								</td>
								<td>
									<img src="../images/status${a.checkStatus}.gif" />
								</td>
								<td>
									${a.bonusWorth}
								</td>
								<td>
									${a.registTime }
								</td>
								<td>
									<a href="bonusDo.do?commend=findBonusDetail&bonusId=${a.bonusId}">查看</a>
								</td>
								<td>
									<logic:equal value="0" name="a" property="checkStatus">
										<input type="checkbox" name="handle" id="handle" value="${a.bonusId}" />
									</logic:equal>
									<logic:equal value="1" name="a" property="checkStatus">
									   已通过
									</logic:equal>
									<logic:equal value="2" name="a" property="checkStatus">
									   审核不通过
									</logic:equal>
									<html:hidden property="humanId" value="${a.humanArchive.humanId}" />
								</td>
							</tr>
						</logic:iterate>
					</logic:notEmpty>
				</table>
				<div class="handle">
					<input type="button" class="btn" value="审核通过"
						onclick="facade('check')" />
					<input type="button" class="btn" value="拒绝通过"
						onclick="facade('pass')" />
					<input type="checkbox" value="0" onClick="selectAll(this)" />
						全选
                        <html:subimt styleClass="btn">返回</html:reset>
				</div>
			</html:form>
		</div>
		<%@include file="../common/page.jsp" %>
	</body>
</html>