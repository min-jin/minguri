<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="../MainTop.jsp" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입 페이지</title>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript" src="resources/js/MemberInsert.js"></script>
<style type="text/css">
   .err{
   font-size: 9pt;
   color: red;
   font-weight: bold;
   }
   .great{
   font-size: 9pt;
   color: green;
   font-weight: bold;
   }
</style>
</head>
<body>

<h2>회원 가입</h2>
<div>
   <form method="post" action="insert.mem" onsubmit="return writecheck()"> 
   
      <p>
         <label for="id">아이디</label>
         <input type="text" name="id" id="id" >
         <button type="button" onclick="dupCheck()">중복확인</button>
		 <span style="display: none;" id="idmessage"></span>
      </p>
      
      <p>
         <label for="password">비번</label>
         <input type="password" name="password" id="password">
      </p>
      <p>
         <label for="repw">비번확인</label>
		<input type="password" placeholder="password입력" name="repw" id="repw" onkeyup="pwCheck()">
		<span style="display: none;" id="pwmessage"></span>
      </p>
      
      <p>
         <label for="nickname">별명</label>
         <input type="text" name="nickname" id="nickname">
      </p>
      
      
      <p>
         <label for="name">이름</label>
         <input type="text" name="name" id="name">
      </p>
      
      <p>
         <label for="hp1">핸드폰번호</label>
        <select name="hp1" id="hp1">
						<option value="">선택</option>
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="016">016</option>
						<option value="017">017</option>
						<option value="018">018</option>
						<option value="019">019</option>
					</select>
         <input type="text" name="hp2" id="hp2" maxlength="4">
         <input type="text" name="hp3" id="hp3" maxlength="4">
      
      </p>
      
      
       <p>
         <label for="email1">이메일</label>
         <input type="text" name="email1" id="email1">@
         <input type="text" name="email3" style="display:none;">
			<select name="email2" onchange="insertEmail(this)" id="mail">
				<option value="">선택</option>
				<option value="naver.com">naver.com</option>
				<option value="hanmail.net">hanmail.net</option>
				<option value="daum.net">daum.net</option>
				<option value="nate.com">nate.com</option>
				<option value="gmail.com">gmail.com</option>
				<option value="hotmail.com">hotmail.com</option>
				<option value="insert">직접입력</option>
			</select>
         
         
      </p>
      <hr>
      <p>
         <label for="postnumber">우편번호</label>
         <input type="text" name="postnumber" id="postnumber">
         <input type="button" value="우편번호찾기" onclick="openDaumPostcode()">
      </p>
      
      <p>
         <label for="address1">주소</label>
         <input type="text" name="address1" id="address1" >
         <input type="text" name="address2" id="address2" >
      </p>
      
      <p>
         	생년월일
         <input type="text" name="year" id="year" >년
         <input type="text" name="month" id="month" >월
         <input type="text" name="day" id="day" >일
      </p>
            
         
      <p>
         <label for="gender">성별</label>
         <input type="radio" name="gender"  value="man">남
         <input type="radio" name="gender"  value="woman">여
      </p>   
   
      <p>
         <input type="submit" value="추가하기">      
      </p>
   </form>
</div>
</body>
<%@include file="../MainBottom.jsp" %>
</html>
