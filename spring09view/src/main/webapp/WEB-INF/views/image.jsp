<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 다루기</title>
</head>
<body>

	<h1>이미지 다루기</h1>
	
	<!-- 
		화면에 이미지 띄우기
		- 원하는 곳에 원하는 크기로 이미지를 띄우기 위한 태그 
		- 종료 태그가 없음(일회성 태그)
		- 크기를 폭(width)과 높이(height)로 부여할 수 있다
		- 크기의 단위는 픽셀(px)이다
		- 비율도 지정이 가능하다 
	 -->
	 <img width="50%" src="https://blog.kakaocdn.net/dn/1JwhP/btqGexDoN77/jq2Ef5sOofQXOLF6gotEX0/img.png">
	
	<br><br>
	<!--  
		내가 가진 이미지를 추가할 경우 /static에 저장한 뒤 호출 
		- http://localhost:8080/이름 으로 호출 가능 
		- 경로를 줄여서 표현할 수 있으며 상대경로도 가능 
	 -->
	 <img width="300" src="/chunsick.png"><!-- 절대경로 -->
	 <br><br>
	 <img width="300" src="chunsick.png"><!-- 상대경로 -->
	 
</body>
</html>

















