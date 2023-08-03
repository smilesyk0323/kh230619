<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.boardNo}번 게시글 </title>
</head>
<body>
	<c:choose>
		<c:when test="${dto != null}">
			<h1>${dto.boardNo}번 게시글 </h1>
	 		<h2>제목 : ${dto.boardTitle}</h2>
			<h2>작성자 : ${dto.boardWriter}</h2>
			<h2>내용 : ${dto.boardContent}</h2>
			
		</c:when>
		<c:otherwise>
			<h1>찾으시는 게시물 번호가 없습니다</h1>
		</c:otherwise>
	</c:choose>
	
	<c:if test="${dto != null }">
		<h2><a href="edit?boardNo=${dto.boardNo}">수정하기</a></h2>
		<h2><a href="delete?boardNo=${dto.boardNo}">삭제하기</a></h2>
		<h2><a href="delete/${dto.boardNo}">삭제하기2</a></h2>
	</c:if>
	<h2><a href="list">목록보기</a></h2>

</body>
</html>