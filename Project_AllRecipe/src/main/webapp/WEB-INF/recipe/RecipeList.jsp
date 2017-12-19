<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../MainTop.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
div{
	align : center;
}
ul {
    list-style:none;
    margin:0;
    padding:0;
}

li {
    margin: 0 0 0 0;
    padding: 0 0 0 0;
    border : 0;
    float: left;
}
</style>


<title>Insert title here</title>
</head>
<!-- 메인 이미지와 한 줄 설명, 이미지 클릭 시 상세보기 화면으로 이동,  테마보기 닫기로 카테고리 보이기 -->
<!-- Note : 자신이 쓴 글만 삭제되는 지 확인 해야함 -->
<body>
<!-- 테마 메뉴 : 12.04 테스트 해봐야 -->
<div class="recipe_tag" align="center" display = "none">
	<ul>
		<li>
			<a>
				<img src="" />
				<p>밥요리</p>
			</a>
		</li>
		
		<li>
			<a>
				<img src="" />
				<p>면요리</p>
			</a>
		</li>
		
		<li>
			<a>
				<img src="" />
				<p>디저트</p>
			</a>
		</li>
			
		<li>
			<a>
				<img src="" />
				<p>구이</p>
			</a>
		</li>
		
		<li>
			<a>
				<img src="" />
				<p>간식</p>
			</a>
		</li>
		
		<li>
			<a>
				<img src="" />
				<p>튀김</p>
			</a>
		</li>
		
		<li>
			<a>
				<img src="" />
				<p>샐러드</p>
			</a>
		</li>
		
		<li>
			<a>
				<img src="" />
				<p>도시락</p>
			</a>
		</li>
		
		<li>
			<a>
				<img src="" />
				<p>찌개&전골</p>
			</a>
		</li>
		
		<li>
			<a>
				<img src="" />
				<p>술안주</p>
			</a>
		</li>
		
		<li>
			<a>
				<img src="" />
				<p>술&칵테일</p>
			</a>
		</li>
	</ul>
</div><br><br><br><br>
<div id ="toggle_theme">테마</div>
<br><br>
<h2>레시피 홈 RecipeList.jsp</h2>
	
	<table>
	<c:forEach items ="${recipeLists }"  var ="recipe">
	<c:set var="uploadmainimage" value="http://localhost:9090${pageContext.request.contextPath }/resources/recipe/${recipe.mainimage }"/>		
		<tr>
			<td>
				<a href="detail.rec?recnum=<c:out value="${recipe.recnum }"/>">
				<img src="${uploadmainimage }"/>
				<p class="s_title"><c:out value="${recipe.shortintro}"/></p>
				<p class="b_title"><c:out value="${recipe.psubject }"/></p>
				</a>
			</td>
		</tr>
	
	</c:forEach>
		<tr>
			<td align="right">
				<input type="button" value="추가" onclick="insert();"/>
			</td>
			
		</tr>
		
	</table>
	<br>
	
	<center>
		${pageInfo.pagingHtml }
	</center>
	
<!-- 레시피 등록 , 수정과 삭제는 자세히 보기에서 -->
<script type="text/javascript">
	
	function insert(){
		location.href='insert.rec'; //get 방식
	}
	
</script>

<!--메뉴 태그 -->
<script type="text/javascript">
    
    $(document).ready(function(){
        $("#toggle_theme").click(function(){
            $(".recipe_tag").slideToggle(500);
        });
    });

</script >

</body>
<%@include file="../MainBottom.jsp" %>
   
</html>

