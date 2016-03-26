<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	
	function requsetJson() {
		
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/requsetJson.action',
			contentType:'application/json;charset=utf-8',
			data:'{"name":"phone","price":999}',
			success : function (data) {
				alert(data);
			}
		
		});
	}

	function responseJson() {
		
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/responseJson.action',
			data:'name=phone&price=999',
			success : function (data) {
				alert(data);
			}
		
		});
	}

</script>

</head>
<body>
<br>
<br>
<br>
	<center>
		<br>
	 	<input type="button" onclick="requsetJson()"  value="请求json，返回json">
	 	<br>
	 	<br>
	 	<br>
	 	<input type="button" onclick="responseJson()" value="请求key/value，返回json">
	 	<br>
	</center>
</body>
</html>