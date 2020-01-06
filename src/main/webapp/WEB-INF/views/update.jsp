<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index2.css">
</head>
<script type="text/javascript">
	function doUpdate(){
		var data=$("#fid").serialize();
		$.ajax({
			url:"${pageContext.request.contextPath}/doUpdate",
			data:data,
			type:"post",
			success:function(msg){
				alert(JSON.stringify(msg))
			}
		});
	}
</script>
<body>
<form action="${pageContext.request.contextPath}/doUpdate" id="fid" method="post">
	<input type="hidden" value="${com.id}" name="id">
	<table>
		<tr>
			<td>关键字</td>
			<td>
				<input type="text" name="keyword" value="${com.keyword}">
			</td>
		</tr>
		<tr>
			<td>描述</td>
			<td>
				<input type="text" name="message" value="${com.message}">
			</td>
		</tr>
		<tr>
			<td>编号</td>
			<td>
				<input type="text" name="id" value="${com.id}">
			</td>
		</tr>
		<tr>
			<td>公司名称</td>
			<td>
				<input type="text" name="name" value="${com.name}">
			</td>
		</tr>
		<tr>
			<td>主管产品</td>
			<td>
				<input type="text" name="goods" value="${com.goods}">
			</td>
		</tr>
		<tr>
			<td>地址</td>
			<td>
				<input type="text" name="address" value="${com.address}">
			</td>
		</tr>
		<tr>
			<td>注册资本(万元)</td>
			<td>
				<input type="text" name="money" value="${com.money}">
			</td>
		</tr>
		<tr>
			<td>成立时间</td>
			<td>
				<input type="date" name="time" value="${com.time}">
			</td>
		</tr>
		<tr>
			<td>年检日期</td>
			<td>
				<input type="date" name="createdate" value="${com.createdate}">
			</td>
		</tr>
		<tr>
			<td>年检状态</td>
			<td>
				<select name="type" id="type">
					<option value="">---请选择---</option>
					<option value="已年检">通过</option>
					<option value="未年检">未通过</option>
					<option value="待定">待定</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>备注</td>
			<td>
				<input type="text" name="beizhu" value="${com.beizhu}">
			</td>
		</tr>
		<tr>
			<td colspan="100">
				<input type="submit" value="提交">
			</td>
		</tr>
	</table>
</form>
</body>
</html>