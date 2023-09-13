<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
 <!-- summernote CDN-->
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <style>
    body{
    background-color:#F2EFFB
    }
      .note-editable{
        line-height:2 !important;
      }
      .container,
		.row,
		.row.h1{
			font-size: 16px;
			color: #182C61;
		}
		.btn,
		.btn.btn-positive{
			background-color:#6460AA;
			color:white;
			border:none;
			line-height: 1.2em;
		}
    </style>
    
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
<form action="edit" method="post">
<input type="hidden" name="boardNo" value="${boardDto.boardNo}">

<div class="container w-600">
	<div class="row">
		<h1>게시글 수정</h1>
	</div>
	
	<div class="row left">
		<label>제목</label>
		<input class="form-input w-100" type="text" name="boardTitle" value="${boardDto.boardTitle}" required>
	</div>
	
	<div class="row left">
		<label>내용</label>
		<textarea class="form-input w-100" name="boardContent" 
			style="min-height:250px" required>${boardDto.boardContent}</textarea>
	</div>
	
	<div class="row right">
		<a href="list" class="btn">
			<i class="fa-solid fa-list"></i>
			목록
		</a>
		<button type="submit" class="btn btn-positive">
			<i class="fa-solid fa-edit"></i>
			수정
		</button>
	</div>
</div>

</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>