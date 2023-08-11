<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>게시글 수정</h2>

<form action="edit" method="post">
	
	제목 <input type="text" name="boardTitle" 
					value="${boardDto.boardTitle}" required><br><br>
	내용 <input type="text" name="boardContent"
					value="${boardDto.boardContent}"><br><br>					
	<button>게시글 수정</button>
</form>
		<h2><a href="list">목록보기</a></h2>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>