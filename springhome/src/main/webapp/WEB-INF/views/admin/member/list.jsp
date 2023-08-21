<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>회원 관리</h2>

<%--검색창 --%>
<form action="list" method="get">
	<c:choose>
		<c:when test="${vo.type == 'member_nickname'}">
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname" selected>닉네임</option>
				<option value="member_contact">전화번호</option>
				<option value="member_email">이메일</option>
				<option value="member_birth">생년월일</option>
			</select>
		</c:when>
		<c:when test="${vo.type == 'member_contact'}">
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname">닉네임</option>
				<option value="member_contact" selected>전화번호</option>
				<option value="member_email">이메일</option>
				<option value="member_birth">생년월일</option>
			</select>
		</c:when>
		<c:when test="${vo.type == 'member_email'}">
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname">닉네임</option>
				<option value="member_contact">전화번호</option>
				<option value="member_email" selected>이메일</option>
				<option value="member_birth">생년월일</option>
			</select>
		</c:when>
		<c:when test="${vo.type == 'member_birth'}">
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname">닉네임</option>
				<option value="member_contact">전화번호</option>
				<option value="member_email">이메일</option>
				<option value="member_birth" selected>생년월일</option>
			</select>
		</c:when>
		<c:otherwise>
			<select name="type">
				<option value="member_id">아이디</option>
				<option value="member_nickname">닉네임</option>
				<option value="member_contact">전화번호</option>
				<option value="member_email">이메일</option>
				<option value="member_birth">생년월일</option>
			</select>
		</c:otherwise>
	</c:choose>
	
	<input type="search" name="keyword" required  
						placeholder="검색어 입력" value="${vo.keyword}">
	<button>검색</button>
</form>
<br>

<%-- 검색일 경우 검색어를 추가로 출력 
		(참고) 논리 반환값을 가지는 getter 메소드는 get이 아니라 is로 시작한다
--%>
<c:if test="${vo.search}"><%--list2 수정 --%>
<h3>&quot;${vo.keyword}&quot;에 대한 검색 결과</h3>
</c:if>


<table border="1"	width="800">
	<thead>
		<tr>
			<th>아이디</th>
			<th>닉네임</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>생년월일</th>
			<th>등급</th>
		</tr>
	</thead>
		<tbody>
			<c:forEach var="memberDto" items="${list}">			
			<tr>
				<td><a style="text-decoration:none ; color: #6460AA; " href="detail?memberId=${memberDto.memberId}">${memberDto.memberId}</a></td>
				<td>${memberDto.memberNickname}</td>
				<td>${memberDto.memberContact}</td>
				<td>${memberDto.memberEmail}</td>
				<td>${memberDto.memberBirth}</td>
				<td>${memberDto.memberLevel}</td>
			</tr>
			</c:forEach>
		</tbody>
</table>
<br>

<h3>
<c:if test="${!vo.first}">
	<a href="list?${vo.prevQueryString}">&lt;</a>
</c:if> 

<c:forEach var="i" begin="${vo.begin}" end="${vo.end}" step="1">
	<a href="list?${vo.getQueryString(i)}">${i}</a>
</c:forEach>

<c:if test="${!vo.last}">
	<a href="list?${vo.nextQueryString}">&gt;</a>
</c:if>

</h3>




<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>