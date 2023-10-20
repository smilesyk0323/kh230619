<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
 <!-- summernote CDN-->
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <style>
      .note-editable{
        line-height:2 !important;
      }
      .form-control:focus {
            color: var(--bs-body-color);
            background-color: var(--bs-body-bg);
            border-color: #bce1d6;
            outline: 0;
            box-shadow: 0 0 0 0.125rem rgba(120, 194, 173, 0.25);
       }
    </style>
    <script>
       $(function(){
        $('[name=boardContent]').summernote({
              placeholder: '내용을 작성하세요',
              tabsize: 2,//탭을 누르면 이동할 간격(보통 2or4로 설정)
              height: 200,//에디터 높이
              minHeight:200,//에디터 최소 높이
              maxHeight:200,
              toolbar: [

              ]
          });
       });
    </script>
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<script src="${pageContext.request.contextPath}/js/boardWrite.js"></script>
<body style="background-color:#F2EFFB">

		    <div class="container-fluid">
        <div class="row">
            <div class="col-md-10 offset-md-1">

                <div class="row">
                    <div class="col text-center pb-3">
                        <c:choose>
                            <c:when test="${isReply}">
                                <h1>답글 작성</h1>
                            </c:when>
                            <c:otherwise>
                                <h1>게시글 작성</h1>
                            </c:otherwise>
                        </c:choose>
                    </div>
                    <div class="row text-end">
                        <div class="col">
	                            <label class="me-1 pb-1">제목</label>
	                        <c:choose>
	                            <c:when test="${isReply}">
	                                <input type="text" name="boardTitle" class="form-control w-100"
	                                    value="RE: ${originDto.boardTitle}" onblur="checkBoardTitle();">
	                                <div class="fail-feedback me-1">제목은 필수이며 100자 이내로 작성하세요</div>
	                            </c:when>
	                            <c:otherwise>
	                                <input type="text" name="boardTitle" class="form-control w-100"
	                                    onblur="checkBoardTitle();">
	                                <div class="fail-feedback me-1">제목은 필수이며 100자 이내로 작성하세요</div>
	                            </c:otherwise>
	                        </c:choose>
                            
                        </div>

                    </div>

                    <div class="row text-end pt-1">
                        <div class="col">
                            <label class=" me-1  pb-1">내용</label>
                            <textarea name="boardContent" class="form-control w-100" style="min-height:250px"
                                oninput="checkBoardContent();"></textarea>
                            <div class="fail-feedback  me-1">내용은 반드시 작성해야 합니다</div>
                        </div>
                    </div>
                    <div class="row text-start">
                        <div class="col">
                            <span class="len red">0</span> / 1000
                        </div>
                    </div>

                    <div class="row text-start pt-3">
                        <div class="col">
                            <a href="list" class="btn btn-outline-primary">목록보기</a>
                            <button type="submit" class="btn btn-primary">글쓰기</button>
                        </div>
                    </div>
                </div>
                </form>

            </div>
        </div>
    </div>
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>