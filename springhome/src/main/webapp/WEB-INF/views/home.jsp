<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%-- 
	매번 페이지 코드를 복사할 수 없으니 미리 만든 것을 불러오도록 설정
	- 템플릿 페이지(template page)라고 부름 
	- 절대경로를 사용할 것
--%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<body style="background-color:#F2EFFB">
	<section>
<div class="row">
<img src="https://img.freepik.com/premium-photo/minimal-render-laptop-purple-background_53036-42.jpg" style="width:70%"></div>
	</section>
	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



