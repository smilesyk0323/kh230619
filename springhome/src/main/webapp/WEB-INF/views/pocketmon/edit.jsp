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


<form action="edit" method="post" enctype="multipart/form-data">

	<div class="container w-300">
	
			<input type="hidden" name="no" value="${pocketmonDto.no}">
			<div class="row">
				<c:if test="${pocketmonDto.image}">
					<img src="image?no=${pocketmonDto.no}" width="100" height="100">
				</c:if>
			</div>
			<div class="row  right mt-20" >
				<!-- input[type=file]은 절.대.로 value를 설정할 수 없다(보안상의 이유) -->
				<input type="file"name="attach">			
			</div>
			<div class="row mt-20">
				이름 : <input type="text" name="name" value="${pocketmonDto.name}">		
			</div>
			<div class="row mt-20">
				속성 : <input type="text" name="type" value="${pocketmonDto.type}">		
			</div>
			<div class="row mt-20">
				<button class="btn" type="submit">수정하기</button>		
			</div>
			
			
			
			
	</div>
</form>
	

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



