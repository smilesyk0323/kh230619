<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<body style="background-color:#F2EFFB"></body>


<h2>회원 정보 변경 </h2>

<form action="edit" method="post">
	<input type="hidden" name="memberId" value="${memberDto.memberId}">
	
	닉네임<input type="text" name="memberNickname"
					value="${memberDto.memberNickname}" required><br><br>
	연락처<input type="tel" name="memberContact"
					value="${memberDto.memberContact}" required><br><br>
	이메일<input type="email" name="memberEmail"
					value="${memberDto.memberEmail}" required><br><br>
	생년월일<input type="date" name="memberBirth"
					value="${memberDto.memberBirth}" required><br><br>
	주소<br>
	<input type="text" name="memberPost" placeholder="우편번호"
					value="${memberDto.memberPost}" required><br>
	<input type="text" name="memberAddr1" placeholder="기본주소"
					value="${memberDto.memberAddr1}" required><br>
	<input type="text" name="memberAddr2" placeholder="상세주소"
					value="${memberDto.memberAddr2}" required><br><br>
	<%-- radio button은 select box와 같은 역할을 한다 --%>
	[등급] 
	<c:choose>
			<c:when test="${memberDto.memberLevel == 'VIP'}">
				<input type="radio" name="memberLevel" value="일반">일반
			    <input type="radio" name="memberLevel" value="VIP"checked>VIP  
			    <input type="radio" name="memberLevel" value="관리자">관리자
			</c:when>
			<c:when test="${memberDto.memberLevel == '관리자'}">
				<input type="radio" name="memberLevel" value="일반">일반
			    <input type="radio" name="memberLevel" value="VIP">VIP  
			    <input type="radio" name="memberLevel" value="관리자"checked>관리자
			</c:when>
			<c:otherwise>
				<input type="radio" name="memberLevel" value="일반"checked>일반
			    <input type="radio" name="memberLevel" value="VIP">VIP  
			    <input type="radio" name="memberLevel" value="관리자">관리자
			</c:otherwise>
	 </c:choose> <br><br>
	포인트<input type="number" name="memberPoint"
					value="${memberDto.memberPoint}"><br><br>
					
		<button>정보변경</button>
	
</form>


<br>
<a style="text-decoration:none ; color: #6460AA; " href="${pageContext.request.contextPath}/admin/member/list">목록보기</a>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>