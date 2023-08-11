<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>${BoardDto.boardNo}번 게시글</h2>

		<c:choose>
			<c:when test="${dto != null}">
				<table>
					<tr>
						<th>제목 </th>
						<td> ${dto.boardTitle}</td>
					</tr>
					<tr>
						<th>작성자</th>
						<td>${dto.boardWriter}</td>
					</tr>
					<tr>
						<th>내용</th>
						<td>${dto.boardContent}</td>
					</tr>
				</table>
			</c:when>
			<c:otherwise>
					<h2>찾으시는 게시물 번호가 없습니다</h2>
			</c:otherwise>
		</c:choose>
		
		<c:if test="${dto != null}">
		<h2><a href="edit?boardNo=${dto.boardNo}">수정하기</a></h2>
		<h2><a href="delete?boardNo=${dto.boardNo}">삭제하기</a></h2>
		
		</c:if>
		<h2><a href="list">목록보기</a></h2>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>