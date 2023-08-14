<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<body style="background-color:#F2EFFB">

<h2>게시글 작성</h2>
	
		<form action="write" method="post" autocomplete="off">
			제목<input name="boardTitle"><br><br>
			내용<textarea name="boardContent"> </textarea><br><br>
			<button>글쓰기</button>
		</form>
			<h2><a style="text-decoration:none ; color: #6460AA; " href="list">목록보기</a></h2>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>