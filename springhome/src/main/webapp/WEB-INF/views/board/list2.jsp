<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
 
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

    <script src="${pageContext.request.contextPath}/js/checkbox.js"></script>
  <style>
.upBtn{
	font-size:14px;
}

  .form-control:focus,
  .form-select:focus {
      color: var(--bs-body-color);
      background-color: var(--bs-body-bg);
      border-color: #bce1d6;
      outline: 0;
      box-shadow: 0 0 0 0.125rem rgba(120, 194, 173, 0.25);
  }


</style> 

                <div class="row">
                    <div class="col-sm-10 offset-sm-1">

                        <div class="container-fluid">
                            <div class="row"><div class="col">
                                <h2>자유 게시판</h2>
                            </div></div>
                            
                            <!-- 폼시작(체크박스) -->
                            <form class="delete-form" action="deleteByAdmin"method="post">
                            <%-- 글쓰기는 로그인 상태인 경우에만 출력 --%>
                            <c:if test="${sessionScope.name != null}">
                                <div class="row text-end"><div class="col">
                                    <c:if test="${sessionScope.level =='관리자' }">
                                        <button type ="submit" class="btn btn-primary upBtn delete-btn">
                                            <i class="fa-solid fa-trash"></i>
                                            일괄삭제</button>
                                    </c:if>                       
                                
                                    <a href="write" class="btn btn-primary upBtn">
                                        <i class="fa-solid fa-pen"></i>
                                        글쓰기
                                    </a>
                                </div></div>
                            </c:if>
                            
                            <%-- 
                                검색일 경우 검색어를 추가로 출력 
                                (참고) 논리 반환값을 가지는 getter 메소드는 get이 아니라 is로 시작한다
                            --%>
                            <c:if test="${vo.search}">
                                    <div class="row text-start"><div class="col">
                                        &quot;${vo.keyword}&quot;에 대한 검색 결과
                                    </div></div>
                            </c:if>
                            
                            <div class="row"><div class="col">
                                <table class="table table-striped table-bordered">
                                    <thead>
                                        <tr>
                                        <%--체크박스 일괄 삭제 --%>
                                        <c:if test="${sessionScope.level =='관리자' }">
                                            <th>
                                                <div class="form-check">
                                                <input type="checkbox" class="check-all form-check-input"  id="flexCheckDefault">
                                                <label class="form-check-label" for="flexCheckDefault"></label>
                                                </div>
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
                                                    <div class="form-check">
                                                        <input type="checkbox"class="check-item form-check-input" name="boardNoList" value="${boardListDto.boardNo }">
                                                        <label class="form-check-label" for="flexCheckDefault"></label>
                                                    </div>
                                                </td>
                                            </c:if>
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
                            </div></div>
                            
                            <!-- 폼 종료(체크박스) -->
                            </form>
                            <div class="row col-6 offset-3">
                            <div class="row page-navigator justify-content-center"><div class="col justify-content-center">
                                <ul class="pagination justify-content-center">
		                                    <li class="page-item me-2">
                                    <!-- 이전 버튼 -->
                                        <c:if test="${!vo.first}">
		                                            <a href="list?${vo.prevQueryString}" class="page-link">
		                                                <i class="fa-solid fa-angle-left"></i>
		                                            </a>
                                        </c:if>
		                                    </li>
                                
                                    <!-- 숫자 버튼 -->
                                    <li class="page-item">
                                        <c:forEach var="i" begin="${vo.begin}" end="${vo.end}" step="1">
	                                            <c:choose>
	                                                <c:when test="${vo.page == i}">
	                                                    <a class="on page-item active link link-primary">${i}</a>
	                                                </c:when>
	                                                <c:otherwise>
	                                                    <a class="page-item link link-primary" href="list?${vo.getQueryString(i)}">${i}</a> 
	                                                </c:otherwise>
	                                            </c:choose>
                                        </c:forEach>
                                    </li>
                                
                                    <!-- 다음 버튼 -->
		                                    <li class="page-item ms-2">
                                        <c:if test="${!vo.last}">
	                                            <a class="page-link" href="list?${vo.nextQueryString}">
	                                                <i class="fa-solid fa-angle-right"></i>
	                                            </a>
                                        </c:if>
		                                    </li>

                                </ul>
                            </div></div></div>
                            
                             <!-- 검색창 -->
                            <form action="list" method="get">
                            <div class="form-group col-8 offset-2 justify-content-center">
                            <div class="row select input-group mb-3"><div class="col d-flex justify-content-center">
                            	<div class="col-2">
	                                <c:choose>
	                                    <c:when test="${param.type == 'board_writer'}">
	                                        <select name="type" required class="form-input form-select">
	                                            <option value="board_title">제목</option>
	                                            <option value="board_writer" selected>작성자</option>
	                                        </select>
	                                    </c:when>
	                                    <c:otherwise>
	                                        <select name="type" required class="form-input form-select">
	                                            <option value="board_title">제목</option>
	                                            <option value="board_writer">작성자</option>
	                                        </select>
	                                    </c:otherwise>
	                                </c:choose>
                            	</div>
                                <div class="col-6 ps-1">
	                                <input type="search" name="keyword"  required class="form-input form-control"
	                                            placeholder="검색어 입력" value="${param.keyword}"
	                                             aria-label="Recipient's username" aria-describedby="button-addon2">
                                </div>
                                <div class="col-2 ps-1">
	                                <button type="submit" class="btn btn-primary w-100"  id="button-addon2">
	                                    <i class="fa-solid fa-magnifying-glass"></i>
	                                    검색
	                                </button>
                                </div>
                            </div></div></div>
                            </form>
                        </div>

					 </div>
                </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


