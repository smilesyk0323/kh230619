<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>

    <!--아이콘 사용을 위한 Font Awesome 6 CDN-->
    <link  rel="stylesheet"type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <!--구글 웹 폰트 사용을 위한 CDN-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&display=swap" rel="stylesheet">
    <!--내가 만든 CSS파일-->
    <link rel="stylesheet"type="text/css" href="/css/reset.css">
    <link rel="stylesheet"type="text/css" href="/css/layout.css">
    <link rel="stylesheet"type="text/css" href="/css/commons.css">
	<!--     <link rel="stylesheet"type="text/css" href="/css/test.css"> -->
	<!-- favicon 설정 -->
	<link rel="shortcut icon" href="/images/favicon.ico">
	
    <style>
    .menu.center{
    	font-size:22px;
    }
    </style>

</head>
<body>
	 <main>
        <header>
            <div class="logo">
                <img src="/images/bora-logo3.png" style="width:70px">
            </div>
            <div class="title">
                <h1 style="color:#6460AA">Bora's Home</h1>
            </div>
           
            <div class="etc"style="color:#6460AA">
             <c:if test="${sessionScope.name != null}">
            	<h3>${sessionScope.name}님[${sessionScope.level}]</h3>
            </c:if>
            </div>
            
        </header>
        <nav>
            <ul class="menu center">
            	<%-- 
				이 페이지는 조각일 뿐이므로 어디서 실행될지 모른다
				여기서 작성되는 경로는 무조건 절대경로여야 한다 
	--%>	
		
	<%--   세션에 저장된 name이라는 이름의 값으로 회원/비회원 구분 		--%>
		<c:choose>
			<c:when test="${sessionScope.name != null}">
			
					<li><a href="/"><i class="fa-regular fa-house"></i></a></li>
					<li><a style="text-decoration:none ; color: #EDE7F6; " href="/member/mypage">Mypage</a></li>
	   				 <li><a style="text-decoration:none ; color: #EDE7F6; " href="/board/list">게시판</a></li>
					<li><a style="text-decoration:none ; color:#EDE7F6; " href="/member/logout">로그아웃</a></li>
	   				
	   				<%-- 관리자인 경우 추가 메뉴 출력 --%>
	   				<c:if test = "${sessionScope.level == '관리자'}">
	   					<li><a style="text-decoration:none ; color: #EDE7F6; " href="/admin/home">관리자메뉴</a></li>
	   				</c:if>
	   				
			</c:when>
			<c:otherwise>
					<li><a href="/"><i class="fa-regular fa-house"></i></a></li>
				   	<li><a style="text-decoration:none ; color: #EDE7F6; " href="/board/list">게시판</a></li>
				   	<li><a style="text-decoration:none ; color: #EDE7F6; " href="/member/join">회원가입</a></li>
				   	<li><a style="text-decoration:none ; color: #EDE7F6; " href="/member/login">로그인</a></li>
				  
			</c:otherwise>
		</c:choose>
       	</ul>
        </nav>
	<section>

	 