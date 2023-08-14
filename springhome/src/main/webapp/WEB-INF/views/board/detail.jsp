<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<body style="background-color:#F2EFFB">

<h2>${boardDto.boardNo}번 게시글</h2>


				<table border="1" width="700">
					<tr>
						<th colspan="1">제목 </th>
						<td colspan="5"> ${boardDto.boardTitle}</td>
					</tr>
					<tr>
						<th colspan="1">작성자</th>
						<td colspan="5">${boardDto.boardWriter}</td>
					</tr>
					<tr>
						<th colspan="1">작성일</th>
						<td colspan="2">${boardDto.boardCtime}</td>
						<th colspan="1">수정시각</th>
						<td colspan="2">${boardDto.boardUtime}</td>
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
				</table>

		
		<h2><a style="text-decoration:none ; color: #6460AA; " href="edit?boardNo=${boardDto.boardNo}">수정하기</a></h2>
		<h2><a style="text-decoration:none ; color: #6460AA; " href="delete?boardNo=${boardDto.boardNo}">삭제하기</a></h2>

		<h2><a style="text-decoration:none ; color: #6460AA; " href="list">목록보기</a></h2>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>