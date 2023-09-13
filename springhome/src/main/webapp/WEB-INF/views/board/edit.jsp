<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<body style="background-color:#F2EFFB">
 <!-- summernote CDN-->
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
    <script>
       $(function(){
        $('[name=boardContent]').summernote({
              placeholder: '내용을 작성하세요',
              tabsize: 2,//탭을 누르면 이동할 간격(보통 2or4로 설정)
              height: 200,//에디터 높이
              minHeight:200,//에디터 최소 높이
              toolbar: [
                ['style', ['style']],
                ['font', ['bold', 'italic', 'underline']],
                ['color', ['color']],
                ['para', ['paragraph']],
                ['table', ['table']],
                ['insert', ['link']],
              ]
          });
       });
    </script>

<h2>게시글 수정</h2>

<form action="edit" method="post">
	<input type="hidden" name="boardNo" value="${boardDto.boardNo}"><br><br>
	제목 <input type="text" name="boardTitle" 
					value="${boardDto.boardTitle}" required><br><br>
	내용 <textarea name="boardContent"
					required>${boardDto.boardContent}</textarea><br><br>					
	<button>게시글 수정</button>
</form>
		<h2><a style="text-decoration:none ; color: #6460AA; " href="list">목록보기</a></h2>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>