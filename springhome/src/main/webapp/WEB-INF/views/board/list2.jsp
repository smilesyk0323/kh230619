<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
 
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

    <script src="${pageContext.request.contextPath}/js/checkbox.js"></script>
  <style>
.btn,
.btn.btn-positive{
	background-color:#6460AA;
	color:white;
	border:none;
	line-height: 1.2em;
}
.upBtn{
	font-size:14px;
}
select.form-input,
.form-input,
.btn{
	font-size:16px;
	height:2.3em;
    border-radius: 0.1em;
}
</style> 
<body style="background-color:#F2EFFB">
<div class="container w-800"style="color: #182C61;">
	<div class="row">
		<h1>자유 게시판</h1>
	</div>
	
	<!-- 폼시작(체크박스) -->
	<form class="delete-form" action="deleteByAdmin"method="post">
	<%-- 글쓰기는 로그인 상태인 경우에만 출력 --%>
	<c:if test="${sessionScope.name != null}">
	<div class="row right ">
		<c:if test="${sessionScope.level =='관리자' }">
		<button type ="submit" class="btn upBtn delete-btn">
			<i class="fa-solid fa-trash"></i>
			일괄삭제</button></c:if>

	
		<a href="write" class="btn upBtn">
			<i class="fa-solid fa-pen"></i>
			글쓰기
		</a>
	</div>
	</c:if>
	
	<%-- 
		검색일 경우 검색어를 추가로 출력 
		(참고) 논리 반환값을 가지는 getter 메소드는 get이 아니라 is로 시작한다
	--%>
	<c:if test="${vo.search}">
	<div class="row left">
		&quot;${vo.keyword}&quot;에 대한 검색 결과
	</div>
	</c:if>
	
	<div class="row">
		<table class="table table-slit"style="color: #182C61;">
			<thead>
				<tr>
				<%--체크박스 일괄 삭제 --%>
				<c:if test="${sessionScope.level =='관리자' }">
					<th>
						<input type="checkbox" class="check-all">
					</th></c:if>
					<th>번호</th>
					<th width="40%">제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
					<th>좋아요</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="boardListDto" items="${list}">
				<tr>
					<%--체크박스 개별 삭제 --%>
					<c:if test="${sessionScope.level =='관리자' }">
					<td>
						<input type="checkbox"class="check-item" name="boardNoList" value="${boardListDto.boardNo }">
					</td></c:if>
					<td>${boardListDto.boardNo}</td>
					<td align="left">
						
						<%-- 차수만큼 띄어쓰기 출력
						
						 --%>
						<%-- for(int i=1; i <= 차수; i++) { --%>
						<c:forEach var="i" begin="1" end="${boardListDto.boardDepth}" step="1">
						&nbsp;&nbsp;
						</c:forEach>
						
						<%-- 띄어쓰기 뒤에 화살표 표시 --%>
						<c:if test="${boardListDto.boardDepth > 0}">
		<!-- 					<img src="https://dummyimage.com/15x15/000/fff"> -->
<!-- 							<img src="/images/reply.png" width="15" height="15"> -->
							<i class="fa-solid fa-reply fa-rotate-180"></i>
						</c:if>
						
					
						<!-- 제목을 누르면 상세페이지로 이동 -->
						<a style="color: #182C61;"class="link" href="detail?boardNo=${boardListDto.boardNo}">
							${boardListDto.boardTitle}
						</a>
						
						<!-- 댓글이 있다면 개수를 표시 -->
						<c:if test="${boardListDto.boardReplycount > 0}">
<%-- 						[${boardListDto.boardReplycount}] --%>
							&nbsp;&nbsp;
							<i class="fa-solid fa-comment"style="color:#9575CD"></i>
							${boardListDto.boardReplycount}							
						</c:if>
					</td>
					<td>${boardListDto.getBoardWriterString()}</td>
					<td>${boardListDto.boardCtimeString}</td>
					<td>${boardListDto.boardReadcount}</td>
					<td>${boardListDto.boardLikecount}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<!-- 폼 종료(체크박스) -->
	</form>
	
	<div class="row page-navigator mv-30">
			<!-- 이전 버튼 -->
			<c:if test="${!vo.first}">
				<a href="list?${vo.prevQueryString}">
					<i class="fa-solid fa-angle-left"></i>
				</a>
			</c:if>
		
			<!-- 숫자 버튼 -->
			<c:forEach var="i" begin="${vo.begin}" end="${vo.end}" step="1">
				<c:choose>
					<c:when test="${vo.page == i}">
						<a class="on">${i}</a>
					</c:when>
					<c:otherwise>
						<a href="list?${vo.getQueryString(i)}">${i}</a> 
					</c:otherwise>
				</c:choose>
			</c:forEach>
		
			<!-- 다음 버튼 -->
			<c:if test="${!vo.last}">
				<a href="list?${vo.nextQueryString}">
					<i class="fa-solid fa-angle-right"></i>
				</a>
			</c:if>
	</div>
	
	<!-- 검색창 -->
	<form action="list" method="get">
	<div class="row select">
		<c:choose>
			<c:when test="${param.type == 'board_writer'}">
				<select name="type" required class="form-input">
					<option value="board_title">제목</option>
					<option value="board_writer" selected>작성자</option>
				</select>
			</c:when>
			<c:otherwise>
				<select name="type" required class="form-input">
					<option value="board_title">제목</option>
					<option value="board_writer">작성자</option>
				</select>
			</c:otherwise>
		</c:choose>
		
		<input type="search" name="keyword"  required class="form-input"
					placeholder="검색어 입력" value="${param.keyword}">
		<button type="submit" class="btn btn-positive" >
			<i class="fa-solid fa-magnifying-glass"></i>
			검색
		</button>
	</div>
	</form>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


