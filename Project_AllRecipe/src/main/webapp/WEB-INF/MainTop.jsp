<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%
	String contextPath=request.getContextPath();
	String Path=request.getRealPath("/map");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap core CSS -->
    <link href="<%= contextPath %>/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%= contextPath %>/resources/css/modern-business.css" rel="stylesheet">
   
    <script src="<%= contextPath %>/resources/js/jquery.js" type="text/javascript"></script>
    
    <!-- 채팅하기 위한 웹소켓 자바스크립트 파일  -->
    <script src="<%= contextPath %>/resources/js/sockjs-1.0.3.min.js" type="text/javascript"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
a {
   color: black;
   font-size: 16px;
   font-weight: bold;
   font-family: "Trebuchet MS", Dotum, Arial;
}
#topMenu {
   height: 50px;
   background-color: #FFC0CB;
   

}

#topMenu ul li {
   list-style: none;
   color: black;
   background-color: #FFC0CB;
   float: left;
   line-height: 50px;
   vertical-align: middle;
   text-align: center;
}

#topMenu .menuLink {
   text-decoration: none;
   color: black;
   display: block;

   width: 270px;
   font-size: 18px;
   font-weight: bold;
   font-family: "Trebuchet MS", Dotum, Arial;
}

#topMenu .menuLink:hover {
   color: #FF1493;
   
}
</style>




</head>
<body>
  <!-- Navigation -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="<%= contextPath %>/mainPage.rec">All recipe</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
          	<c:if test="${loginInfo==null }">
	            <li class="nav-item">
	              <a class="nav-link" href="<%= contextPath %>/login.mem">로그인</a>
	            </li>
	            <li class="nav-item">
	              <a class="nav-link" href="<%= contextPath %>/insert.mem">회원가입</a>
	            </li>
            </c:if>
            <c:if test="${loginInfo!=null }">
	            <li class="nav-item">
	              <a class="nav-link" href="<%= contextPath %>/logout.jsp">로그아웃</a>
	            </li>
	            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                	마이페이지
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
                <a class="dropdown-item" href="<%= contextPath %>/myhome.mem">MyHome</a>
                <a class="dropdown-item" href="<%= contextPath %>/pass.mem?passnum=1">개인정보수정</a>
                <a class="dropdown-item" href="<%= contextPath %>/pass.mem?passnum=2">비밀번호수정</a>
                <a class="dropdown-item" href="portfolio-3-col.html">주문내역</a>
                <a class="dropdown-item" href="portfolio-4-col.html">문의내역</a>
              </div>
            </li>
            </c:if>
            <li class="nav-item">
              <a class="nav-link" href="<%= contextPath %>/opinion/list.bod">고객센터</a>
            </li>
            
          </ul>
        </div>
      </div>
    </nav>
    <div class="container" align="center">

      <a href="<%= contextPath %>/mainPage.rec"> <img src="" width="40%"
         alt="올레시피" />
      </a>

   </div>
   <nav id="topMenu" >
<div align="center" >
   <ul>
      <li><a class="menuLink" href="<%= contextPath %>/list.rec">레시피</a></li>
      <li><a class="menuLink" href="<%= contextPath %>/talk/list.bod">토크</a></li>
      <li><a class="menuLink" href="">요리정보</a></li>
      <li><a class="menuLink" href="<%= contextPath %>/list.mt">시장보기</a></li>
      <li><a class="menuLink" href="#">내가쉐프</a></li>
      <li><a class="menuLink" href="<%= contextPath %>/martMap.mt">올맛집</a></li>
   </ul>
   </div>
   </nav>
mainTop<br>
session.loginInfo=${loginInfo.id }
</body>
</html>
