<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<body style="background-color:#F2EFFB">

<h2>게시글 수정</h2>

<form action="edit" method="post">
	<input type="hidden" name="boardNo" value="${boardDto.boardNo}"><br><br>
	제목 <input type="text" name="boardTitle" 
					value="${boardDto.boardTitle}" required><br><br>
	내용 <input type="text" name="boardContent"
					value="${boardDto.boardContent}"><br><br>					
	<button>게시글 수정</button>
</form>
		<h2><a style="text-decoration:none ; color: #6460AA; " href="list">목록보기</a></h2>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>