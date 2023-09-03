<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<script src="/js/join.js"></script>
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

<form action="join" method="post" autocomplete="off" onsubmit="return checkForm();">
        <div class="container w-500">
                <div class="row"><h1 style="color:#6460AA">회원 가입</h1></div>
                <div class="required">
                        <div class="row left">
                            <label for="id-input">아이디<span class="important">*</span></label>
                            <input type="text"name="memberId" class="form-input w-100" id="id-input"
                                placeholder="영문 소문자+숫자 8~20자 5~20자 이내"onblur="checkMemberId();">
                            <div class="success-feedback">가입 가능한 아이디입니다</div>
                            <div class="fail-feedback">아이디는 영문과 숫자 5~20자로 작성하세요</div>  
                        </div>
                        <div class="row left">
                            <label for="id-input">비밀번호<span class="important">*</span></label>
                            <input type="password"name="memberPw" class="form-input w-100" 
                                placeholder="영문+숫자+특수문자 반드시 포함 8~16자" onblur="checkMemberPw();">
                            <div class="success-feedback">올바른 비밀번호 형식입니다</div>
                            <div class="fail-feedback">영문,숫자,특수문자를 반드시 포함하여 8~16자로 작성하세요</div>
                        </div>
                        <div class="row left">
                            <label for="id-input">비밀번호 확인<span class="important">*</span></label>
                            <input type="password" id="password-check" class="form-input w-100" oninput="checkMemberPw2();"
                            	placeholder="비밀번호 확인을 위해 위와 동일하게 입력해주세요">
                            <div class="success-feedback">비밀번호가 일치합니다</div>
                            <div class="fail-feedback">비밀번호가 일치하지 않습니다</div>
                            <div class="fail2-feedback">비밀번호를 먼저 작성하세요</div>

                        </div>
                        <div class="row left">
                            <label for="id-input">닉네임<span class="important">*</span></label>
                            <input type="text"name="memberNickname" class="form-input w-100" 
                                placeholder="한글 또는 숫자2~10자 이내"onblur="checkMemberNick()">
                            <div class="success-feedback">사용 가능한 닉네임입니다</div>
                            <div class="fail-feedback">한글 또는 숫자 2~10자 이내로 작성하세요</div>
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
                    <button type="submit" class="btn btn-positive w-50"
                    style="background-color:#6460AA">가입하기</button>
                </div>
            </div>
    </form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>