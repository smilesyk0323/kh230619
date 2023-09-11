<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>


<!-- 댓글과 관련된 처리를 할 수 있도록 jQuery코드 구현 -->
<script>
$(function(){
	//목표 : 댓글등록을 누르면 입력정보로 "ajax 통신"을 통해 댓글을 등록 처리
	//(주의) form은 전송이 되면 안된다(기본이벤트차단)
	
	$(".reply-insert-form").submit(function(e){
		//this == e.target == 폼(form)
		
		//입력검사 코드(skip)
		
		//기본이벤트 차단
		e.preventDefault();
		
		//비동기 통신 발생
		$.ajax({
			url:"/rest/reply/insert",
			method:"post",
			//data:{replyOrigin : ? , replyContent : ?},
			data : $(e.target).serialize(),
			success:function(response){
				//console.log("성공");
				$("[name=replyContent]").val("");//입력창 초기화
				loadList();//목록갱신
			}
		});
	});
	
	//목록은 페이지가 로딩되면 바로 불러오도록 구현한다
	//- 등록이 완료된 경우 불러오도록 구현한다
	//- 여러 군데서 사용할 수 있도록 함수 형태로 구현한다 
	//- 목록을 모두 지우고 전부 다 새로 불러오도록 구현한다
	loadList();
	
	//목록을 불로온 뒤 추가로 해야할 것
	//- 내 글에만 수정/삭제 버튼이 나오도록 처리
	//- 게시글 작성자가 쓴 댓글에 추가 표시 
	//- 수정 버튼을 누르면 화면에 변화를 주도록 처리
	//- 삭제 버튼을 누르면 확인창 출력 후 삭제하도록 처리
	function loadList(){
	
		//Javascript로 boardNo라는 이름의 파라미터 값 읽기
		var params = new URLSearchParams(location.search);
		var no = params.get("boardNo");
		
		//(중요)로그인한 사용자의 정보를 EL을 이용하여 저장(매우 위험한 코드)
		var memberId = "${sessionScope.name}";
		
		//비동기 통신으로 화면 갱신
		$.ajax({
			url:"/rest/reply/list",
			method:"post",
			data:{replyOrigin : no },
			success:function(response){
				//화면 청소
				//$(".reply-list").remove();//자기 자신까지 삭제(하면안됨!)
				$(".reply-list").empty();//자기 자신을 제외한 내부 코드 삭제
				
				//response는 댓글 목록(JSON)
				for(var i=0; i< response.length; i++){
					var reply = response[i];
					
					var template = $("#reply-template").html();
					var htmlTemplate = $.parseHTML(template);
					
					//작성자를 표시할 때 다음과 같이 로직을 추가
					//탈퇴한 사용자는 빈칸이 아니라 "탈퇴한 사용자"로처리
					$(htmlTemplate).find(".replyWriter").text(reply.replyWriter || "탈퇴한 사용자");
					$(htmlTemplate).find(".replyContent").text(reply.replyContent);
					$(htmlTemplate).find(".replyTime").text(reply.replyTime);
					
					//내가 작성한 댓글이 아니라면
					if(memberId.length == 0 || memberId != reply.replyWriter){
						//버튼 숨기기
						$(htmlTemplate).find(".w-25").empty();
					}
					
					
					$(".reply-list").append(htmlTemplate);
				}
			},
		});
	}
});
</script>
<script id="reply-template" type="text/template">
		<div class="row flex-container">
				<div class="w-75">
						<div class="row left">
								<h3 class="replyWriter"></h3>
						</div>
						<div class="row left">
								<pre class="replyContent"></pre>
						</div>
						<div class="row left">
								<span class="replyTime"></span>
						</div>
				</div>
				<div class="w-25 ">
						<div class="row right">
							<button class="btn ">
							<i class="fa-solid fa-edit"></i>
							</button>	
						</div>
						<div class="row right">
							<button class="btn ">
							<i class="fa-solid fa-trash"></i>
							</button>			
						</div>
				</div>			
		</div>
		
</script>
<style>
body{
background-color:#F2EFFB;
}
.btn,
.btn.btn-positive,
.btn.btn-negative{
	background-color:#6460AA;
	color:white;
	border:none;
	line-height: 1.2em;
}
</style>
<div class="container w-800 ">
	<div class="row">
		<h1 style="color:#4A148C">
			${boardDto.boardNo}번 게시글
			<c:if test="${boardDto.boardUtime != null}">
				(수정됨)
			</c:if>
		</h1>
	</div>
	<div class="row left">
		<h3 style="color:#4A148C">
			<i class="fa-solid fa-user"></i>
			${boardDto.boardWriterString}
			<%-- 탈퇴한 사용자가 아닐 경우 닉네임을 옆에 추가로 출력 --%>
			<c:if test="${writerDto != null}">
			(${writerDto.memberNickname})
			</c:if>
		</h3>
	</div>
	<div class="row right"style="color:#4A148C">
				<fmt:formatDate value="${boardDto.boardCtime}" pattern="y년 M월 d일 E a h시 m분 s초"/>
	</div>
	<div class="row right">
		<i class="fa-solid fa-eye"></i> 
		${boardDto.boardReadcount}
		&nbsp;&nbsp;
		<i class="fa-solid fa-heart red"></i> 
		${boardDto.boardLikecount}
		&nbsp;&nbsp;
		<i class="fa-solid fa-comment blue"></i> 
		${boardDto.boardReplycount}
	</div>
	<div class="row left">
		<h2 style="color:#4A148C">${boardDto.boardTitle}</h2>
	</div>
	<%-- 게시글 내용(본문) --%>
	<div class="row left" style="min-height:250px">
		<pre style="color:#4A148C">${boardDto.boardContent}</pre>
	</div>
	
	<%--댓글과 관련된 화면이 작성될 위치 --%>
	<div class="row left">
		<form class="reply-insert-form">
				<input type="hidden" name="replyOrigin"value="${boardDto.boardNo}">
				<div class="row">
						<textarea name="replyContent" class="form-input w-100" rows="4"></textarea>
				</div>	
				<div class="row">
						<button class="btn btn-positive w-100">
						<i class="fa-solid fa-pen"></i>
						댓글등록</button>
				</div>
		</form>
	</div>
	
	<%--댓글 목록이 표시될 영역 --%>
	<div class="row left reply-list">
		

	</div>
	
	<%--각종 버튼이 위치하는 곳 --%>
	<div class="row right">
		<%-- 회원일 때만 글쓰기,수정,삭제가 나와야 한다 --%>
		<c:if test="${sessionScope.name != null}">
		<a class="btn btn-positive" href="write">
			<i class="fa-solid fa-pen"></i>
			새글
		</a>
		<a class="btn btn-positive" href="write?boardParent=${boardDto.boardNo}">
			<i class="fa-solid fa-comment"></i>
			답글
		</a>
		
		<%-- 수정/삭제는 소유자일 경우만 나와야 한다 --%>
		<c:if test="${sessionScope.name == boardDto.boardWriter}">
		<a class="btn btn-negative" href="edit?boardNo=${boardDto.boardNo}">
			<i class="fa-solid fa-pen-to-square"></i>
			수정
		</a>
		<a class="btn btn-negative" href="delete?boardNo=${boardDto.boardNo}">
			<i class="fa-solid fa-trash"></i>
			삭제
		</a>
		</c:if>
		</c:if>
		<a class="btn btn-positive" href="list"style="background-color:#6460AA; border:none">
			<i class="fa-solid fa-list"></i>
			목록
		</a>
	</div>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>