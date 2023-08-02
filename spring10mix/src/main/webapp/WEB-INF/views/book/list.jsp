<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 목록</title>
</head>
<body>
	<h1>도서 목록</h1>
	
	<table  border="1" width="500">
		<thead>
			<tr>
				<th>번호</th>
				<th width="50%">도서제목</th>
				<th>저자명</th>
			</tr>
		</thead>
		<tbody align="center">
			<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.bookId}</td>
				<td><a href="detail?bookId=${dto.bookId}">${dto.bookTitle}</a></td>
				<td>${dto.bookAuthor}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>