<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
    <link rel="stylesheet" type="text/css"href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.3.2/yeti/bootstrap.min.css" rel="stylesheet">

<div class="row"><div class="col">

<div class="row"><div class="col">
	<div class="col-4 offset-4 text-center mt-5">
	<h1>결제를 배웁시다</h1>
	</div>
</div></div>

<div class="row"><div class="col">
	
	<c:if test="${sessionScope.name == null}">
	<div class="row"><div class="col text-center mt-5">
	<h2>로그인</h2>
	</div></div>
	</c:if>
	
	<div class="row"><div class="col-4 offset-4 text-center mt-3">
	<c:choose>
		<c:when test="${sessionScope.name == null}">
			<form action="login" method="post">
				<input type="text" name="memberId" placeholder="아이디"  class="form-control"><br><br>
				<input type="password" name="memberPw" placeholder="비밀번호" class="form-control"><br><br>
				<button type="submit" class="btn btn-primary w-100">로그인</button>
			</form>
		</c:when>
		<c:otherwise>
			<h4>${sessionScope.name} 으로 로그인 중</h4>
			<a href="logout" class="btn btn-secondary mt-3">로그아웃</a>
		</c:otherwise>
	</c:choose>
	</div></div>
	
</div></div>

		<div class="row"><div class="col-4 offset-4 text-center mt-5">
			<c:if test="${sessionScope.name != null}">
			<h3><a href="pay/test3" class="btn btn-success ">구매하러 가기</a></h3>
			</c:if>
		</div></div>
		
</div></div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
















