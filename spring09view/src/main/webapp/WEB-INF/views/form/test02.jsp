<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	<h1>게시글 작성</h1>	
	<!-- 
			작성자(boardWriter)
			제목(boardTitle)
			내용(boardcontent)
			 - 여러줄 입력창(textarea)으로 처리 (rows=줄수, cols=칸수)
	 -->
	
	 <form action="http://localhost:8080/insert">
 		게시물 제목 : <input name=boardTitle><br><br>
 		게시물 작성자 : <input name="boardWriter"><br><br>
 		<!-- 게시물 내용 : <input name="boardContent"><br><br> -->
 		게시물 내용:<textarea name="boardContent"rows="10"cols="50"></textarea><br><br>
 		<button>글쓰기</button>
 		
 	</form>
</body>
</html>