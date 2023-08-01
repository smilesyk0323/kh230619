<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>
	<h1>게시글 등록</h1>	
	
	 <form action="http://localhost:8080/insert">
 		게시물 제목 : <input name=boardTitle><br><br>
 		<!-- 게시물 내용 : <input name="boardContent"><br><br> -->
 		게시물 내용:<textarea name="boardContent"rows="10"cols="10"></textarea>
 		게시물 작성자 : <input name="boardWriter"><br><br>
 		<button>등록</button>
 		
 	</form>
</body>
</html>