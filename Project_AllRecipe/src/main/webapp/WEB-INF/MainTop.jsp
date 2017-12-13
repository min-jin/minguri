<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%
	String contextPath=request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap core CSS -->
    <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/css/modern-business.css" rel="stylesheet">
    <script src="resources/js/jquery.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
  <!-- Navigation -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="mainPage.rec">All recipe</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
          	<c:if test="${loginInfo==null }">
	            <li class="nav-item">
	              <a class="nav-link" href="login.mem">로그인</a>
	            </li>
	            <li class="nav-item">
	              <a class="nav-link" href="insert.mem">회원가입</a>
	            </li>
            </c:if>
            <c:if test="${loginInfo!=null }">
	            <li class="nav-item">
	              <a class="nav-link" href="logout.jsp">로그아웃</a>
	            </li>
	            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                	마이페이지
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
                <a class="dropdown-item" href="portfolio-1-col.html">MyHome</a>
                <a class="dropdown-item" href="portfolio-2-col.html">개인정보수정</a>
                <a class="dropdown-item" href="portfolio-3-col.html">주문내역</a>
                <a class="dropdown-item" href="portfolio-4-col.html">문의내역</a>
              </div>
            </li>
            </c:if>
            <li class="nav-item">
              <a class="nav-link" href="board/opinion/list.bd">고객센터</a>
            </li>
            
          </ul>
        </div>
      </div>
    </nav>
mainTop<br>
session.loginInfo=${loginInfo.id }
</body>
</html>