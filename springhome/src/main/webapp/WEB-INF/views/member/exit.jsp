<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
  <style>
  .container{
  	color: #182C61;
  }
 body{
 background-color:#F2EFFB;
 }
.btn.btn-negative{
	background-color:#6460AA;
	color:white;
	border:none;
	line-height: 1.2em;
}
 
 </style>  
<div class="row container w-600">
		<div class="row">
		<h2>회원탈퇴</h2>
		</div>
				<div class="row">
					<c:if test="${param.error != null}">
						<h3 style="color:red">입력하신 비밀번호가 일치하지 않습니다</h3>
					</c:if>
				</div>
				<div class="row mt-20">
					<h3>정말 탈퇴하시겠습니까? 탈퇴 후 정보는 사라집니다</h3>
				</div>
		<div class="row">	
		<form action="exit" method="post">		 
				<input class="form-input mt-20" type="password" name="memberPw"placeholder="비밀번호입력">
				<button class="btn btn-negative">회원탈퇴</button>	
		</form>
		</div>	
</div>

	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>