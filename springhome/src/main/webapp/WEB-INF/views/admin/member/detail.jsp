<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%--날짜나 시간을 이뿌게??? --%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<body style="background-color:#F2EFFB"></body>


<h2>${memberDto.memberId} 님의 회원정보</h2>

<table border="1" width="500">
		<tr>
			<th>닉네임</th>
			<td>${memberDto.memberNickname}</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>${memberDto.memberEmail}</td>
		</tr>
		<tr>
			<th>연락처</th>
			<td>${memberDto.memberContact}</td>
		</tr>
		<tr>
			<th>생년월일</th>
			<td>${memberDto.memberBirth}</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>
			[${memberDto.memberPost}] 
			${memberDto.memberAddr1} 
			${memberDto.memberAddr2}
			</td>
		</tr>
		<tr>
			<th>등급</th>
			<td>${memberDto.memberLevel}</td>
		</tr>
		<tr>
			<th>포인트</th>
			<td>
				<fmt:formatNumber value="${memberDto.memberPoint}" 
									pattern="#,##0"></fmt:formatNumber> pt
			</td>
		</tr>
		<tr>
			<th>가입일</th>
				<td>
					<fmt:formatDate value="${memberDto.memberJoin}" 
										pattern="Y년 M월 d일 E a h시 m분 s초"/>
				</td>
		</tr>
		<tr>
			<th>마지막로그인</th>
				<td>
					<fmt:formatDate value="${memberDto.memberLogin}" 
										pattern="Y년 M월 d일 E a h시 m분 s초"/>
				</td>
		</tr>
		<tr>
			<th>마지막변경일</th>
				<td>
					<fmt:formatDate value="${memberDto.memberChange}" 
										pattern="Y년 M월 d일 E a h시 m분 s초"/>
				</td>
		</tr>		
</table>

<h2>활동 내역</h2>
<table border="1" width="500">
	<thead>
			<tr>
				<th width="75%">제목</th>
				<th>작성일</th>
			</tr>
	</thead>
	<tbody>
		<c:forEach var="boardListDto" items="${boardList}">
			<tr>
				<td>
				<a href="/board/detail?boardNo=${boardListDto.boardNo}">${boardListDto.boardTitle}</a></td>
				<td>${boardListDto.boardCtime}</td>
			</tr>		
		</c:forEach>
	</tbody>
</table>


<br>
<a style="text-decoration:none ; color: #6460AA; " href="/admin/member/list">목록보기</a>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>










