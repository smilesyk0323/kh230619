<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<style>
.container,
.row{
	font-size: 16px;
	color:#6460AA;
}
.btn,
.btn.btn-positive{
	background-color:#6460AA;
	color:white;
	border:none;
	 line-height: 1.2em;
}
.form-input{
	size:12px;
}

</style>
<body style="background-color:#F2EFFB">

<form action="join" method="post" autocomplete="off">
    <div class="container w-500">
            <div class="row"><h1 style="color:#6460AA">회원 가입</h1></div>
            <div class="required">
                    <div class="row left">
                        <!--라벨에는 for를 이용하여 특정 대상을 연결시킬 수 있다
                                for="대상ID"
                                체크박스 등도 선택하게 만들 수 있다 (디자인적으로 활용)
                        -->
                        <label for="id-input">아이디<span class="important">*</span></label>
                        <input type="text"name="memberId" class="form-input w-100" id="id-input"
                            placeholder="영문 소문자+숫자 8~20자 5~20자 이내">
                    </div>
                    <div class="row left">
                        <label for="id-input">비밀번호<span class="important">*</span></label>
                        <input type="password"name="memberPw" class="form-input w-100" 
                            placeholder="영문 대소문자+숫자+특수문자 반드시 포함 8~16자">
                    </div>
                    <div class="row left">
                        <label for="id-input">닉네임<span class="important">*</span></label>
                        <input type="text"name="memberNickname" class="form-input w-100" 
                            placeholder="한글 또는 숫자2~10자 이내">
                    </div>
          </div>
            <div class="row left">
                <label>이메일</label>
                <input type="email"name="memberEmail" class="form-input w-100" 
                     placeholder="testuser@kh.com">
            </div>
            <div class="row left">
                <label>연락처</label>
                <input type="tel"name="memberContact" class="form-input w-100" 
                     placeholder="- 제외하고 입력">
            </div>
            <div class="row  left">
                <label>생년월일</label>
                <input type="date"name="memberBirth" class="form-input w-100" >
            </div>
            <div class="row left">
                <label style="display: block;">주소</label>
                <input type="text"name="memberPost" class="form-input w-60 mb-10" 
                     placeholder="우편번호"size="6" maxlength="6">
                     <button type="button" class="btn mb-10">우편번호찾기</button>
                <input type="text"name="memberAddr1" class="form-input w-100" 
                     placeholder="기본주소">
                <input type="text"name="memberAddr2" class="form-input w-100" 
                     placeholder="상세주소">
            </div>
            <div class="row ">
                <button type="submit" class="btn btn-positive w-50">가입하기</button>
            </div>
        </div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>