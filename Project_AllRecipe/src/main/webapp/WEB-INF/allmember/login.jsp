<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../MainTop.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
$(function(){
	$("#insert").click(function(){
		location.href="insert.mem";	
	});
	$("#findid").click(function(){
		location.href="findid.mem";
	});
	$("#findpw").click(function(){
		location.href="findpw.mem";
	});
})
	
</script>
</head>
<body>
<form action="login.mem" method="post">
	아이디<input type="text" name="id" placeholder="아이디쳐라" value="${userid }" ><br>
	비번<input type="password" name="password" placeholder="비번쳐라" value="${userpw }"><br>
	<input type="submit" value="로그인">
	<input type="button" value="회원가입" id="insert">
	<input type="button" value="아이디찾기" id="findid">
	<input type="button" value="비번찾기" id="findpw">
</form>

</body>
<%@include file="../MainBottom.jsp" %>
</html>