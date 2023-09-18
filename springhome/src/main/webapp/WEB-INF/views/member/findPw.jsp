<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<style>
.container{
	color:#6460AA;
}
.btn.btn-positive{
	background-color:#6460AA;
	color:white;
	border:none;
}
.form-input{
	size:16px;
}
</style>
<body style="background-color:#F2EFFB">

<div class="container w-500">
<div class="row">
<h2>비밀번호 찾기</h2>
</div>

<form action="findPw" method="post">
<div class="row">
	<label>아이디</label><input type="text" name="memberId">
</div>
<div class="row ">
	<label>이메일</label><input type="email"name="memberEmail">
</div>
<div class="row">
	<button type="submit">비밀번호 찾기</button>
</div>


</form>


</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



















