<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../MainTop.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	.err{
		font-size : 9pt;
		color : red;
		font-weight : bold;
	}
</style>
<title>Insert title here</title>
</head>
<body>

레시피 추가화면
<div>
	<form:form commandName="recipe" method="post" action="insert.rec" enctype="multipart/form-data">
		
		
		<p><!-- 요리 분류의 value 값 숫자로    -->
			<label for="theme">요리 분류</label>	
				<select name="theme" id="theme" >
					<option value="" selected>선택</option>
					<option value="1">밥요리</option>
					<option value="2">면요리</option>
					<option value="3">디저트</option>
					<option value="4">구이</option>
					<option value="5">간식</option>
					<option value="6">튀김</option>
					<option value="7">샐러드</option>
					<option value="8">도시락</option>
					<option value="9">찌개&전골</option>
					<option value="10">술안주</option>
					<option value="11">술&칵테일</option>
				</select>
			<form:errors cssClass = "err" path="theme"/>
		</p>
		
		<p>
			<label for="psubject">요리이름</label>
			<input type="text" name="psubject" id="psubject" value=""/>
			<form:errors cssClass="err" path="psubject"/>
		</p>
		
		<p>
			<label for="shortintro">간단한 설명</label>
			<input type="text" name="shortintro" id="shortintro" value="간단한 설명"/>
		</p>
		
		<p>
			<label for="mainimage">메인 이미지</label>
			<input type="file" name="mainimage" id="mainimage" value=""/>
		</p>
		
		<p>
			<label for="ingredient">재료</label>
			<input type="text" name="ingredient" id="ingredient" value="재료"/>
		</p>
		
		<p>
			<label for="intro">설명</label>
			<input type="text" name="intro" id="intro" value="설명"/>
		</p>	
		
		<p>
			<label for="movieurl">동영상</label>
			<input type="text" name="movieurl" id="movieurl" value="동영상링크는 여기에 남겨주세요"/>
		</p>

		<p>
			<label for="image1">그림파일1</label>
			<input type="file" name="image1" id="image1" value=""/>
		</p>
		
		<p>
			<label for="image2">그림파일2</label>
			<input type="file" name="image1" id="image1" value=""/>
		</p>
		
		<p>
			<label for="image3">그림파일3</label>
			<input type="file" name="image1" id="image1" value=""/>
		</p>
		
		<p>
			<label for="image4">그림파일4</label>
			<input type="file" name="image1" id="image1" value=""/>
		</p>
		
		
		<p class="btnRow">
			<input type="submit" value="추가하기" id="btnSubmit"/>
		</p>
	
	</form:form>
</div>

</body>
<%@include file="../MainBottom.jsp" %>
</html>