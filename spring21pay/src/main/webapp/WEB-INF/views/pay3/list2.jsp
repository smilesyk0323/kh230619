<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
    <link rel="stylesheet" type="text/css"href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.3.2/spacelab/bootstrap.min.css" rel="stylesheet">

<h1>결제 내역(계층형)</h1>

<!-- 전체 목록 -->
<c:forEach var="paymentListVO" items="${list}">

	<div style="border: 1px solid black; margin: 30px 0px; padding:10px">
	
		<!-- 대표 정보 -->
		<div style="border: 1px solid blue; padding:10px;" class="payment">
			${paymentListVO.paymentDto}
			<hr>
			
			<%--전체취소 버튼은 잔여금액이 있을 때만 출력되어야 한다 --%>
			<c:if test="${paymentListVO.paymentDto.paymentRemain > 0}">
				<a href="cancelAll?paymentNo=${paymentListVO.paymentDto.paymentNo}">
					전체(잔여) 금액 취소</a>
			</c:if>
		</div>
		
		<!-- 상세 목록 정보 -->
		<div style="border: 1px solid red; padding:10px; margin-top:10px;" class="payment-detail">
			<c:forEach var="paymentDetailDto" items="${paymentListVO.paymentDetailList}">
				<div style="border: 1px solid gray; padding:10px; margin-top:10px;">
					${paymentDetailDto}
					<br>
					
					<%--취소가 가능한 상황일 경우에만 개별내역 취소 버튼을 출력 --%>
					<c:if test="${paymentDetailDto.paymentDetailStatus == '완료'}">
						<a href="cancel?paymentDetailNo=${paymentDetailDto.paymentDetailNo}">개별내역 취소</a>
					</c:if>
				</div>
			</c:forEach>
		</div>
		
	</div>
</c:forEach>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>















