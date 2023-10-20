<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>

	<!-- favicon 설정 -->
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
    <!--내가 만든 CSS파일-->
    <link rel="stylesheet"type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet"type="text/css" href="${pageContext.request.contextPath}/css/layout.css">
    <link rel="stylesheet"type="text/css" href="${pageContext.request.contextPath}/css/commons.css">
    <!--아이콘 사용을 위한 Font Awesome 6 CDN-->
    <link  rel="stylesheet"type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <!--구글 웹 폰트 사용을 위한 CDN-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&display=swap" rel="stylesheet">
   <!-- 부트스트랩 CDN + 스킨 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.3.2/minty/bootstrap.min.css" rel="stylesheet">
    
    <%--
    			절대 경로를 설정하기 위한 스크립트 작성 
    				-절대경로라는 개념은 백엔드에만 있다
    				-클래식 자바스크립트에서 절대경로를 알 수 있는 방법이 없다
    				-window에 절대경로 값을 탑재시켜 사용 
    --%>
    <script>
    	window.contextPath = "${pageContext.request.contextPath}";
    </script>
    
    <!--jquery CDN-->
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
	<!--     <link rel="stylesheet"type="text/css" href="/css/test.css"> -->
	
	
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
                <img src="${pageContext.request.contextPath}/images/bora-logo3.png" style="width:70px">
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
			
					<li><a style="text-decoration:none ; color: #EDE7F6; " href="${pageContext.request.contextPath}/">Home</a></li>
					<li><a style="text-decoration:none ; color: #EDE7F6; " href="${pageContext.request.contextPath}/member/mypage">Mypage</a></li>
	   				 <li><a style="text-decoration:none ; color: #EDE7F6; " href="${pageContext.request.contextPath}/board/list">게시판</a></li>
	   				  <li><a style="text-decoration:none ; color: #EDE7F6; " href="${pageContext.request.contextPath}/pocketmon/list">포켓몬</a>
	   				    <ul>
	   				  		<li><a href="${pageContext.request.contextPath}/pocketmon/insert"> 등록</a></li>
	   				    </ul>
	   				  </li>
					<li><a style="text-decoration:none ; color:#EDE7F6; " href="${pageContext.request.contextPath}/member/logout">로그아웃</a></li>
	   				
	   				<%-- 관리자인 경우 추가 메뉴 출력 --%>
	   				<c:if test = "${sessionScope.level == '관리자'}">
	   					<li><a style="text-decoration:none ; color: #EDE7F6; " href="${pageContext.request.contextPath}/admin/home">관리자메뉴</a></li>
	   				</c:if>
	   				
			</c:when>
			<c:otherwise>
					<li><a style="text-decoration:none ; color: #EDE7F6; " href="${pageContext.request.contextPath}/">Home</a></li>
				   	<li><a style="text-decoration:none ; color: #EDE7F6; " href="${pageContext.request.contextPath}/board/list">게시판</a></li>
				   	<li><a style="text-decoration:none ; color: #EDE7F6; " href="${pageContext.request.contextPath}/member/join">회원가입</a></li>
				   	<li><a style="text-decoration:none ; color: #EDE7F6; " href="${pageContext.request.contextPath}/member/login">로그인</a></li>
				  
			</c:otherwise>
		</c:choose>
       	</ul>
        </nav>
	<section>

	 