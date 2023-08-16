<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<body style="background-color:#F2EFFB">

<h1>자유 게시판</h1>

<%-- 글쓰기는 로그인 상태인 경우에만 출력 --%>
<c:if test="${sessionScope.name != null}">
<h3><a style="text-decoration:none ; color: #6460AA; " href="write">글쓰기</a></h3>
</c:if>

<table border="1" width="700">
	<thead>
		<tr>
			<th>번호</th>
			<th width="40%">게시글제목</th>
			<th width="15%">닉네임</th> 
			<th width="15%">작성일자</th>
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
			<!-- 제목을 누르면 상세페이지로 이동 -->
			<a style="text-decoration:none ; color: #6460AA; " href="detail?boardNo=${boardDto.boardNo}">${boardDto.boardTitle}</a>
			<!-- 댓글이 있다면 개수를 표시 -->
			<c:if test="${boardDto.boardReplycount > 0}">
			[${boardDto.boardReplycount}]
			</c:if>
			</td>
		
<%-- 		사용자가 없으면 탈퇴한 사용자로 표시			
				<c:choose>
					<c:when test="${boardDto.boardWriter != null}">
						<td>${boardDto.boardWriter}</td>
					</c:when>
					<c:otherwise>
						<td>(탈퇴한 사용자)</td>
					</c:otherwise>
				</c:choose>
 --%>
			<td>${boardDto.boardWriterString}</td>
<%-- 			<td>${boardDto.boardWriter}</td> --%>
			<td>${boardDto.boardCtimeString}</td>
			<td>${boardDto.boardReadcount}</td>
			<td>${boardDto.boardLikecount}</td>
			<td>${boardDto.boardReplycount}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>