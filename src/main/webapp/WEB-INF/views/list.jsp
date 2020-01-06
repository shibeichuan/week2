<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index2.css">
</head>
<script type="text/javascript">
	function goPage(page){
		location="${pageContext.request.contextPath}/list?page="+page+"&"+$("#fid").serialize();
	}
	function toUpdate(id) {
		location="${pageContext.request.contextPath}/toUpdate?id="+id;
	}
</script>
<body>
<form id="fid" action="${pageContext.request.contextPath}/list" method="post">
	编号:<input type="text" name="id" value="${com.id}">&nbsp;&nbsp;&nbsp;
	关键字:<input type="text" name="keyword" value="${com.keyword}">&nbsp;&nbsp;&nbsp;
	描述:<input type="text" name="message" value="${com.message}">&nbsp;&nbsp;&nbsp;
	名称:<input type="text" name="name" value="${com.name}"><br>
	产品:<input type="text" name="goods" value="${com.goods}">
	&nbsp;&nbsp;地址:<input type="text" name="address" value="${com.address}">
	最低资金:<input type="text" name="minmoney" value="${com.minmoney}">
	最高资金:<input type="text" name="maxmoney" value="${com.maxmoney}"><br>
	开始时间:<input type="date" name="startdate" value="${com.startdate}">
	结束时间:<input type="date" name="enddate" value="${com.enddate}">
	年检状态:<select name="type">
				<option value="">---请选择---</option>
				<option value="已年检">通过</option>
				<option value="未年检">未通过</option>
				<option value="待定">待定</option>
			</select>
	<input type="submit" value="搜索">
</form>
<table>
	<tr>
		<td>编号</td>
		<td>关键字</td>
		<td>描述</td>
		<td>公司名称</td>
		<td>主营产品</td>
		<td>地址</td>
		<td>注册资本</td>
		<td>成立时间</td>
		<td>年检日期</td>
		<td>年检状态</td>
		<td>备注</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${info.list}" var="com">
		<tr>
			<td>${com.id}</td>
			<td>${com.keyword}</td>
			<td>${com.message}</td>
			<td>${com.name}</td>
			<td>${com.goods}</td>
			<td>${com.address}</td>
			<td>${com.money}</td>
			<td>${com.createdate}</td>
			<td>${com.time}</td>
			<td>${com.type}</td>
			<td>${com.beizhu}</td>
			<td>
				<input type="button" value="年检审核"  onclick="toUpdate(${com.id})">
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="100">
			<jsp:include page="/WEB-INF/views/pages2.jsp"></jsp:include>
		</td>
	</tr>
</table>
</body>
</html>