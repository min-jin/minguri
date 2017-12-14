<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../MainTop.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
레시피 상세 보기
<c:set var="mainImage" value="http://localhost:9090${pageContext.request.contextPath }/resources/${recipe.mainimage }"/>
<c:set var="image1" value="http://localhost:9090${pageContext.request.contextPath }/resources/${recipe.image1 }"/>
<c:set var="image2" value="http://localhost:9090${pageContext.request.contextPath }/resources/${recipe.image2 }"/>
<c:set var="image3" value="http://localhost:9090${pageContext.request.contextPath }/resources/${recipe.image3 }"/>
<c:set var="image4" value="http://localhost:9090${pageContext.request.contextPath }/resources/${recipe.image4 }"/>


<div align="center">
	<table border="1">
		<tr>
			<td>
				<img src="${recipe.mainImage }"/>
			</td>
			
			<td align="center">
				<table border="1">
					<tr height="50">
						<td width="120">요리이름</td>
						<td width="300"><c:out value="${recipe.psubject }"/></td>
					</tr>
					
					<tr height="50">
						<td width="120">간단한 설명</td>
						<td width="300"><c:out value="${recipe.shortintro }"/></td>
					</tr>
				
					<tr height="50">
						<td width="120">재료</td>
						<td width="300"><c:out value="${recipe.ingredient }"/></td>
					</tr>
					
					
					
					<tr height="50">
						<td width="120">동영상 </td>
						<td width="300"><c:out value="${recipe.movieurl }"/></td>
					</tr>
					
					
				</table>
			</td>
		</tr>
		
			<tr>
				<td>
					<img src="${image1 }"/>
				</td>
			</tr>
			
			<tr>
				<td>
					<img src="${image2 }"/>
				</td>
			</tr>
			
			<tr>
				<td>
					<img src="${image3 }"/>
				</td>
			</tr>
			
			<tr>
				<td>
					<img src="${image4 }"/>
				</td>
			</tr>
			
			<tr>
				<td width="120">설명</td>
				<td width="300"><c:out value="${recipe.intro }"/></td>
			</tr>
		
	</table>
</div>
<input type="button" value="레시피" onclick="goList();"/>
</body>

<script type="text/javascript">
	function goList(){// 버튼 누르면 레시피로 이동
		location.href='list.rec'; //get 방식
	}
</script>
<%@include file="../MainBottom.jsp" %>
</html>