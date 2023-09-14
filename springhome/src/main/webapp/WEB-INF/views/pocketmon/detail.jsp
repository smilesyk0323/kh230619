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
<div class="container w-800">
	<div class="row">
		<h1> [포켓몬 등록] </h1>
	</div>
	<div class="row flex-container">
	<div class="row col-2">
		<div class="row">	
				<c:choose>
					<c:when test="${pocketmonDto.image}">
						<img src="image?no=${pocketmonDto.no}" width="100"height="100">
					</c:when>
					<c:otherwise>
						<img src="https://dummyimage.com/200x200/000/fff" width="100" height="100">
					</c:otherwise>
				</c:choose>
			</div>
	</div>
		
		<div class="row col-2  mt-50">
				<div class="row left ">
					<h1> no : ${pocketmonDto.no}</h1>
				</div>
				<div class="row left">
					<h1>name : ${pocketmonDto.name}</h1>
				</div>
				<div class="row left">
					<h1>type : ${pocketmonDto.type}</h1>
				</div>
		</div>
		
		</div>
</div>
	

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



