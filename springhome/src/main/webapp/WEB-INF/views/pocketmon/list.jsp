<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<style>
body{
background-color:#F2EFFB
}
.btn,
.btn.btn-positive{
	font-size:16px;
	background-color:#6460AA;
	color:white;
	border:none;
	line-height: 1.2em;
}


</style>
<div class="container w-300">

<c:forEach var="pocketmonDto" items="${list}">
	<div>
		${pocketmonDto.no} / ${pocketmonDto.name} / ${pocketmonDto.type} 
		
		<hr>
		<c:choose>
			<c:when test="${pocketmonDto.image}">
				<img src="image?no=${pocketmonDto.no}" width="200"height="200">
			</c:when>
			<c:otherwise>
				<img src="https://dummyimage.com/200x200/000/fff" width="200" height="200">
			</c:otherwise>
		</c:choose><br><br>
		<a class="btn"href="edit?no=${pocketmonDto.no}">수정</a>
		<a class="btn"href="delete?no=${pocketmonDto.no}">삭제</a>
			
	</div><br><br>

</c:forEach>
</div>







	

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



