<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<body style="background-color:#F2EFFB">

<h2>${boardDto.boardNo}번 게시글</h2>

				<table border="1" width="700">
					<tr>
						<th colspan="1">제목 </th>
						<td colspan="5"> ${boardDto.boardTitle}</td>
					</tr>
					<tr>
						<th colspan="1">닉네임</th>
						<td colspan="5">${boardDto.boardWriterString}</td>
					</tr>
					<tr>
						<th colspan="1">작성일</th>
						<td colspan="2">
						<fmt:formatDate value="${boardDto.boardCtime}" 
										pattern="Y년 M월 d일"/></td>
						<th colspan="1">최근 수정일</th>
						<td colspan="2">
						<fmt:formatDate value="${boardDto.boardUtime}" 
										pattern="Y년 M월 d일"/></td>
					</tr>
					<tr>
						<th>조회수</th>
						<td>${boardDto.boardReadcount}</td>
						<th>좋아요</th>
						<td>${boardDto.boardLikecount}</td>
						<th>댓글수</th>
						<td>${boardDto.boardReplycount}</td>
					</tr>
					<tr>
						<td  colspan="6">${boardDto.boardContent}</td>
					</tr>
						<tr>
							<td colspan="6" align="center">
							<%-- 회원일때만 글쓰기,수정,삭제가 나와야 한다 --%>
							<c:if test="${sessionScope.name != null}">
								<a style="text-decoration:none ; color: #6460AA; " href="write">글쓰기</a>
								<a style="text-decoration:none ; color: #6460AA; " href="#">답글쓰기</a>
								
										<%--수정/삭제는 소유자일 경우만 나와야 한다  --%>
										<c:if test="${sessionScope.name == boardDto.boardWriter}">
										<a style="text-decoration:none ; color: #6460AA; " href="edit?boardNo=${boardDto.boardNo}">수정하기</a>
										<a style="text-decoration:none ; color: #6460AA; " href="delete?boardNo=${boardDto.boardNo}">삭제하기</a>									
										</c:if>
							</c:if>
								<a style="text-decoration:none ; color: #6460AA; " href="list">목록보기</a>
							</td>
					</tr>
				</table>
	

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>