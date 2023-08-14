<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<body style="background-color:#F2EFFB">
<h2>회원탈퇴</h2>

<c:if test="${param.error != null}">
	<h3 style="color:red">입력하신 비밀번호가 일치하지 않습니다</h3>
</c:if>

		<h3>정말 탈퇴하시겠습니까? 탈퇴 후 정보는 사라집니다</h3>
		
<form action="exit" method="post">		
		비밀번호입력<input type="password" name="memberPw" required placeholder="비밀번호입력">
		<button>회원탈퇴</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>