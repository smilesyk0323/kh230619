<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
    <link rel="stylesheet" type="text/css"href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.3.2/spacelab/bootstrap.min.css" rel="stylesheet">

<h1>구매내역 확인</h1>

<!-- 보여주는 부분 -->
<c:forEach var="confirmVO" items="${list}">
	<div class="purchase-item">
		[${confirmVO.productDto.productNo}] 
		${confirmVO.productDto.productName}
		-
		${confirmVO.productDto.productPrice}원
		(구매수량 : ${confirmVO.purchaseVO.qty}개)
		-
		총 ${confirmVO.total}원
	</div>
</c:forEach>
<hr>
<h2>총 ${total}원</h2>
<!-- 전송되는 부분 -->
<form method="post">
	<c:forEach var="confirmVO" items="${list}" varStatus="stat">
		<input type="hidden" name="product[${stat.index}].productNo" value="${confirmVO.purchaseVO.productNo}">
		<input type="hidden" name="product[${stat.index}].qty" value="${confirmVO.purchaseVO.qty}">
	</c:forEach>
	<button type="submit">구매하기</button>
</form>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>









