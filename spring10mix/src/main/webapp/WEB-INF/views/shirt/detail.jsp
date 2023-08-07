<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세정보</title>
</head>
<body>
	
	<h1>상품 상세정보</h1>
	
	<table border="1" width="500">
		<tr>
			<th width="25%">상품번호</th>
			<td>${dto.shirtNo}</td>
		</tr>
		<tr>
			<th>상품명</th>
			<td>${dto.shirtName}</td>
		</tr>
		<tr>
			<th>색상</th>
			<td>${dto.shirtColor}</td>
		</tr>
		<tr>
			<th>판매가</th>
			<td>${dto.shirtPrice}원</td>
		</tr>
		<tr>
			<th>종류</th>
			<td>${dto.shirtKind}</td>
		</tr>
		<tr>
			<th>유형</th>
			<td>${dto.shirtType}</td>
		</tr>
		<tr>
			<th>재질(원단)</th>
			<td>${dto.shirtMaterial}</td>
		</tr>
		<tr>
			<th>구매가능수량</th>
			<td>${dto.shirtStock}개</td>
		</tr>
	</table>
	
	<h2><a href="list">목록으로</a></h2>
	<h2><a href="add">신규등록</a></h2>
	<h2><a href="edit?shirtNo=${dto.shirtNo}">정보변경</a></h2>
	<h2><a href="delete?shirtNo=${dto.shirtNo}">상품삭제</a></h2>
	
</body>
</html>