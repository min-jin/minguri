<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../MainTop.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!-- 메인 이미지와 한 줄 설명, 이미지 클릭 시 상세보기 화면으로 이동,  테마보기 닫기로 카테고리 보이기 -->
<!-- Note : 입력, 수정, 추가, 삭제 확인해야함, 자신이 쓴 글만 삭제되는 지 확인 해야함 -->
<body>
<!--테마 메뉴 : 12.03 미완성 -->
<div class="recipe_tag">
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
	<a href="javascript:tag_btn();" class="tag_btn on"></a>
</div>

<h2>레시피 홈 RecipeList.jsp</h2>
	
	<table>
	<c:forEach items ="${recipeLists }"  var = "recipe">
		
		<tr>
			<td>
				<a href="detail.rec?recnum=<c:out value="${recipe.num }"/>">
				<img src="<c:out value="${recipe.mainimage }"/>" alt="" / style="width:100%">
				<p class="s_title">간단한 설명</p>
				<p class="b_title"><c:out value="${recipe.psubject }"/></p>
				</a>
			</td>
		</tr>
		
		
	
	
	</c:forEach>
		<tr>
			<td align="right">
				<input type="button" value="추가" onclick="insert();"/>
			</td>
			
			<td>
				<input type="button" value="수정" value="${recipe.num }" onclick="goUpdate('${recipe.num}')"/>
			</td>
			
			<td>
				<input type="button" value="삭제" value="${recipe.num }" onclick="goDelete('${recipe.num}')"/>
			</td>
		</tr>
		
	</table>
	<br>
	
	<center>
		${pageInfo.pagingHtml }
	</center>
	
	
<script type="text/javascript">
	
	function insert(){
		location.href='insert.rec'; //get 방식
	}
	
	function goUpdate(num){
		location.href = 'update.rec?recnum = ' + num; //RecipeUpdateController get
	}
	
	function goDelete(num){
		location.href = 'delete.rec?recnum =' + num; //RecipeDeleteController get 
	}
	
</script>	
</body>
<%@include file="../MainBottom.jsp" %>
   
</html>

<!-- 이밥차는 테이블 안 만들고 div - ul - li 로 화면 구분
<div class="rec_list">
		<ul class="clr">
						<li class="ml_none">
				<a href="/recipe.php?id=view&eTheme=1&idx=1074">
					<div class="img_wrap"><img src="data/recipe/20170521143444-K3XQM.jpg" alt="" / style="width:100%"></div>
					<div class="text_box">
						<p class="s_title">입에 착착 감기는 부드러움</p>
						<p class="b_title">게살치즈죽</p>
					</div>
				</a>
			</li>
			</ul>
			</div> -->