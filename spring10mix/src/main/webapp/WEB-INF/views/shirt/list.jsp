<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셔츠 상품 목록</title>
</head>
<body>
	<h1>셔츠 상품 목록</h1>
	
	<h2><a href="add">신규 상품 등록</a></h2>
	
	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>색상</th>
				<th>가격</th>
				<th>종류</th>
				<th>유형</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list}">
			<tr>
				<td>
					<a href="detail?shirtNo=${dto.shirtNo}">
						${dto.shirtName}
					</a>
				</td>
				<td>${dto.shirtColor}</td>
				<td>${dto.shirtPrice}</td>
				<td>${dto.shirtKind}</td>
				<td>${dto.shirtType}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

