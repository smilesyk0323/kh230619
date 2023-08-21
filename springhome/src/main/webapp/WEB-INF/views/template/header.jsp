<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>
</head>
<body>
	<div align="center">
	 <h1 style="color:#6460AA">Bora's Home</h1>
	<hr>
		<%--
				JSP에서 세션에 저장된 값을 확인하려면  EL의 내장객체를 사용
				sessionScope 내장객체를 사용하면 HttpSession의 값을 조회할 수 있다
			세션ID = ${pageContext.session.id},
		 --%>
		 <c:if test="${sessionScope.name != null}">
	 <p style="color:#ad79a4">${sessionScope.name}님 환영합니다
	                                            등급 : ${sessionScope.level}</p>
</c:if>
	<%-- 
				이 페이지는 조각일 뿐이므로 어디서 실행될지 모른다
				여기서 작성되는 경로는 무조건 절대경로여야 한다 
	--%>	
		
	<%--   세션에 저장된 name이라는 이름의 값으로 회원/비회원 구분 		--%>
		<c:choose>
			<c:when test="${sessionScope.name != null}">
					<a href="/"><img width="35" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbvPHh_PD8kK8kD1AwGvB3uPaEgKlr1DkjnlgtVyDgHj9-pgafLE7-OwGlK6wNcWGjIW8&usqp=CAU"></a>
					<a style="text-decoration:none ; color: #6460AA; " href="/member/mypage">Mypage</a>
					<a style="text-decoration:none ; color: #6460AA; " href="/member/logout">로그아웃</a>
	   				<a style="text-decoration:none ; color: #6460AA; " href="/board/list">게시판</a>
	   				
	   				<%-- 관리자인 경우 추가 메뉴 출력 --%>
	   				<c:if test = "${sessionScope.level == '관리자'}">
	   					<a style="text-decoration:none ; color: #6460AA; " href="/admin/home">[관리자메뉴]</a>
	   				</c:if>
	   				
			</c:when>
			<c:otherwise>
			<a href="/"><img width="35" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbvPHh_PD8kK8kD1AwGvB3uPaEgKlr1DkjnlgtVyDgHj9-pgafLE7-OwGlK6wNcWGjIW8&usqp=CAU"></a>
				   	<a style="text-decoration:none ; color: #6460AA; " href="/member/join">회원가입</a>
				   	<a style="text-decoration:none ; color: #6460AA; " href="/member/login">로그인</a>
				   	<a style="text-decoration:none ; color: #6460AA; " href="/board/list">게시판</a>
			</c:otherwise>
		</c:choose>

	<hr>
	 