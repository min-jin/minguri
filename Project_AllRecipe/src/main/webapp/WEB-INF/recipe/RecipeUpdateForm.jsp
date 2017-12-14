<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../MainTop.jsp" %>
<html>
<style type="text/css">
	.err{
		font-size : 9pt;
		color : red;
		font-weight : bold;
	}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
레시피 수정

<div>
	<form:form commandName="recipe" method="post" action="update.rec" enctype="multipart/form-data">
		
		
		<p><!-- 요리 분류의 value 값 숫자로    -->
			<label for="theme">요리 분류</label>	
				<select name="theme" id="theme" >
					<option value="" selected>선택</option>
					<option value="1" <c:if test="${recipe.theme== 1 }"/> selected>밥요리</option>
					<option value="2" <c:if test="${recipe.theme== 2 }"/> selected>면요리</option>
					<option value="3" <c:if test="${recipe.theme== 3 }"/> selected>디저트</option>
					<option value="4" <c:if test="${recipe.theme== 4 }"/> selected>구이</option>
					<option value="5" <c:if test="${recipe.theme== 5 }"/> selected>간식</option>
					<option value="6" <c:if test="${recipe.theme== 6 }"/> selected>튀김</option>
					<option value="7" <c:if test="${recipe.theme== 7 }"/> selected>샐러드</option>
					<option value="8" <c:if test="${recipe.theme== 8 }"/> selected>도시락</option>
					<option value="9" <c:if test="${recipe.theme== 9 }"/> selected>찌개&전골</option>
					<option value="10" <c:if test="${recipe.theme== 10 }"/> selected>술안주</option>
					<option value="11" <c:if test="${recipe.theme== 11 }"/> selected>술&칵테일</option>
				</select>
			<form:errors cssClass = "err" path="theme"/>
		</p>
		
		<p>
			<label for="psubject">요리이름</label>
			<input type="text" name="psubject" id="psubject" value="${recipe.psubject }"/>
			<form:errors cssClass="err" path="psubject"/>
		</p>
		
		<p>
			<label for="shortintro">간단한 설명</label>
			<input type="text" name="shortintro" id="shortintro" value="${recipe.shortintro }"/>
		</p>
		
		<p>
			<label for="mainimage">메인 이미지</label>
			<input type="file" name="mainimage" id="mainimage" value="${recipe.mainimage }"/>
		</p>
		
		<p>
			<label for="ingredient">재료</label>
			<input type="text" name="ingredient" id="ingredient" value="${recipe.ingredient }"/>
		</p>
		
		<p>
			<label for="intro">설명</label>
			<input type="text" name="intro" id="intro" value="${recipe.intro }"/>
		</p>	
		
		<p>
			<label for="movieurl">동영상</label>
			<input type="text" name="movieurl" id="movieurl" value="${recipe.movieurl }"/>
		</p>

		<p>
			<label for="image1">그림파일1</label>
			<input type="file" name="image1" id="image1" value="${recipe.image1 }"/>
		</p>
		
		<p>
			<label for="image2">그림파일2</label>
			<input type="file" name="image1" id="image1" value="${recipe.image2 }"/>
		</p>
		
		<p>
			<label for="image3">그림파일3</label>
			<input type="file" name="image1" id="image1" value="${recipe.image3 }"/>
		</p>
		
		<p>
			<label for="image4">그림파일4</label>
			<input type="file" name="image1" id="image1" value="${recipe.image4 }"/>
		</p>
		
		
		<p class="btnRow">
			<input type="submit" value="추가하기" id="btnSubmit"/>
		</p>
	
	</form:form>
</div>
</body>
<%@include file="../MainBottom.jsp" %>
</html>