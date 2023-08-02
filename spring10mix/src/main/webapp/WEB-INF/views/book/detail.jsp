<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 상세 정보</title>
</head>
<body>
	<!-- 
		리스트 태그 
		- 외부에 <ul> 또는 <ol>을 사용
			- ul은 순서가 없는 리스트(unorder list)
			- ol은 순서가 있는 리스트(order list)/순번이 생김
		-내부 항목에 <li>를 사용(list item)
		- 트리구조를 표현할 수 있는 리스트(메뉴를 펼치는 느낌)
		<ul>
			<li>${dto.bookId}</li>
			<li>${dto.bookTitle}</li>
			<li>${dto.bookAuthor}</li>
			<li>${dto.bookPublicationDate}</li>
			<li>${dto.bookPrice}</li>
			<li>${dto.bookPublisher}</li>
			<li>${dto.bookPageCount}</li>
			<li>${dto.bookGenre}</li>
		</ul>
	 -->

	<c:choose>
		<c:when test="${dto != null }">
		
			<h2>${dto.bookId}번 도서정보</h2>
				<table border="1" width="500" >
					<tr align="center">
						<th colspan="2" bgcolor="CED8F6">도서명</th>
						<td colspan="2"bgcolor="EFF8FB">${dto.bookTitle}</td>
					</tr>
					<tr align="center">
						<th colspan="2" bgcolor="CED8F6">저자</th>
						<td colspan="2"bgcolor="EFF8FB">${dto.bookAuthor}</td>
					</tr>
					<tr align="center">
						<th bgcolor="CED8F6">판매가</th>
						<td bgcolor="EFF8FB">$ ${dto.bookPrice}</td>
						<th bgcolor="CED8F6">출판사</th>
						<td bgcolor="EFF8FB">${dto.bookPublisher}</td>
					</tr>
					<tr align="center">
						<th bgcolor="CED8F6">페이지수</th>
						<td bgcolor="EFF8FB">${dto.bookPageCount}</td>
						<th bgcolor="CED8F6">출판일</th>
						<td bgcolor="EFF8FB">${dto.bookPublicationDate}</td>
					</tr>	
				</table>
		</c:when>	
		<c:otherwise>
			<h1>찾으시는 도서정보가 없습니다</h1>
		</c:otherwise>
	
	</c:choose>

</body>
</html>