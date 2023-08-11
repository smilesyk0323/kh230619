<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>게시글 목록</h1>
<h2>
	<a href="write">글쓰기</a>
</h2>
<table border="1" width="700">
	<thead>
		<tr>
			<th>번호</th>
			<th width="50%">게시글제목</th>
			<th>작성자</th> 
			<th>작성일자</th>
			<th>조회수</th>
			<th>좋아요</th>
			<th>댓글수</th>
		</tr>	
	</thead>
	<tbody>
		<c:forEach var="boardDto" items="${list}">
		<tr align="center">
			<td>${boardDto.boardNo}</td>
			<td align="left">
			<a href="detail?boardNo=${boardDto.boardNo}">${boardDto.boardTitle}</a></td>
			<td>${boardDto.boardWriter}</td>
			<td>${boardDto.boardCtime}</td>
			<td>${boardDto.boardReadcount}</td>
			<td>${boardDto.boardLikecount}</td>
			<td>${boardDto.boardReplycount}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>