<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<script src="${pageContext.request.contextPath}/js/multipage.js"></script>
<script src="${pageContext.request.contextPath}/js/join.js"></script>
<!-- daum 우편 API cdn -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

    
<script>
$(function(){
    //최초 게이지 계산
    refreshProgressbar();

    //이전이나 다음버튼을 누르면 진행상황을 파악하여 게이지 계산
    $(".btn-prev, .btn-next").click(function(){
        refreshProgressbar();
    });

    function refreshProgressbar() {
        //page중에 보여지는 태그를 찾아서 계산
        //- 전체 페이지 수 + 보여지는 페이지 번호

        var count = 0;
        var index = 0;
        $(".page").each(function(idx, el){
            //if(현재 태그가 표시중이라면) {
            if($(this).is(":visible")) {
                index = idx+1;
            }
            count++;
        });

        var percent = index * 100 / count;
        $(".progressbar > .guage").css("width", percent+"%");
    }
});

$(function(){
    //검색버튼, 우편번호 입력창, 기본주소 입력창을 클릭하면 검색 실행
    $(".post-search").click(function(){
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                //document.querySelector("[name=memberPost]").value = data.zonecode;
                $("[name=memberPost]").val(data.zonecode);
                //document.querySelector("[name=memberAddr1]").value = addr;
                $("[name=memberAddr1]").val(addr);
                // 커서를 상세주소 필드로 이동한다.
                //document.querySelector("[name=memberAddr2]").focus();
                $("[name=memberAddr2]").focus();
                $(".post-clear").show();
            }
        }).open();
    });
    
    //x버튼 누르면 주소 지우기
    $(".post-clear").click(function(){
    	$("[name=memberPost],[name=memberAddr1],[name=memberAddr2]").val("").removeClass("success fail");
    });
    $("[name=memberAddr2]").on("input blur", function(){
		var post = $("[name=memberPost]").val();
		var addr1 = $("[name=memberAddr1]").val();
		var addr2 = $("[name=memberAddr2]").val();
		if(post.length == 0 && addr1.length == 0 && addr2.length == 0) {
			$(".post-clear").hide();				
		}
		else {
			$(".post-clear").show();        	
		}
    });
    $(".post-clear").hide();
});
</script>
<style>
 .form-control:focus {
     color: var(--bs-body-color);
     background-color: var(--bs-body-bg);
     border-color: #bce1d6;
     outline: 0;
     box-shadow: 0 0 0 0.125rem rgba(120, 194, 173, 0.25);
 }


input::placeholder {
  font-size: 0.9em;
}
/*
     진행바 디자인
 */
 .progressbar{
     width: 100%;
     height: 5px;
 }
 .progressbar > .guage{
     width: 0%;
     height: 100%;
     background-color: #bce1d6;
     transition: width 0.2s ease-out;/*스르륵*/
 }
</style>
<body style="background-color:#F2EFFB">

                <div class="row ">
                    <div class="col">

                        <form class="join-form" action="join" method="post" autocomplete="off">
                            <div class="container-fluid ">
                                    <div class="row col-6 offset-3 text-center"><div class="col">
                                            <h2>회원 정보 입력</h2>
                                        </div></div>
                                    
                                        <!-- 전체 진행단계를 알 수 있는 게이지 출력 -->
                                        <div class="row pb-3">
                                            <div class=" progressbar">
                                                <div class="guage"></div>
                                            </div>
                                        </div>
                                    <div class="page col-6 offset-3">
                                        <div class="row"><div class="col">
                                            <h3>1단계 아이디/비밀번호</h3>
                                        </div></div>
                                                <div class="row text-start"><div class="col">
                                                    <div class="ms-2">
                                                        <label for="id-input">아이디<span class="text-danger">*</span></label>
                                                    </div>
                                                    <input type="text"name="memberId" class="form-control w-100" id="id-input"
                                                        placeholder="영문 소문자+숫자 8~20자 5~20자 이내">
                                                    <div class="success-feedback">가입 가능한 아이디입니다</div>
                                                    <div class="fail-feedback">아이디는 영문과 숫자 5~20자로 작성하세요</div> 
                                                    <div class="fail2-feedback">이미 사용중인 아이디입니다</div> 
                                                </div></div>
                                                <div class="row  text-start"><div class="col">
                                                    <div class="ms-2">
                                                        <label for="id-input">비밀번호<span class="text-danger">*</span></label>
                                                    </div>
                                                    <input type="password"name="memberPw" class="form-control w-100" 
                                                        placeholder="영문+숫자+특수문자 반드시 포함 8~16자" >
                                                    <div class="success-feedback">올바른 비밀번호 형식입니다</div>
                                                    <div class="fail-feedback">영문,숫자,특수문자를 반드시 포함하여 8~16자로 작성하세요</div>
                                                </div></div>
                                                <div class="row  text-start"><div class="col">
                                                    <div class="ms-2">
                                                        <label for="id-input">비밀번호 확인<span class="text-danger">*</span></label>
                                                    </div>
                                                <input type="password" id="password-check" class="form-control w-100"
                                                    placeholder="확인을 위해 위와 동일하게 입력해주세요">
                                                <div class="success-feedback">비밀번호가 일치합니다</div>
                                                <div class="fail-feedback">비밀번호가 일치하지 않습니다</div>
                                                <div class="fail2-feedback">비밀번호를 먼저 작성하세요</div>
                    
                                            </div></div>
                                             <div class="row pt-2"><div class="col">
                                                <button type="button"class="btn btn-primary btn-prev">이전</button>
                                                <button type="button"class="btn btn-primary btn-next">다음</button>
                                            </div></div>
                                  </div>
                                  <div class="page  col-6 offset-3">
                                          <div class="row"><div class="col">
                                            <h3>2단계 닉네임/생년월일/이메일</h3>
                                        </div></div>
                                            <div class="row text-start"><div class="col">
                                                <div class="ms-2">
                                                    <label for="id-input">닉네임<span class="text-danger">*</span></label>
                                                </div>
                                                <input type="text"name="memberNickname" class="form-control w-100" 
                                                    placeholder="한글 또는 숫자2~10자 이내">
                                                <div class="success-feedback">사용 가능한 닉네임입니다</div>
                                                <div class="fail-feedback">한글 또는 숫자 2~10자 이내로 작성하세요</div>
                                                <div class="fail2-feedback">닉네임이 이미 사용중입니다</div>
                                            </div></div>
                                            <div class="row  text-start"><div class="col">
                                                <div class="ms-2">
                                                    <label>이메일<span class="text-danger">*</span></label>
                                                </div>
                                                    <input type="email"name="memberEmail" class="form-control w-100" 
                                                         placeholder="testuser@kh.com" >
                                                    <div class="fail-feedback">이메일 형식이 올바르지 않습니다</div>
                                                    <div class="fail2-feedback">현재 이메일은 이미 사용중입니다</div>
                                                </div></div>
                                            <div class="row   text-start"><div class="col">
                                                <div class="ms-2">
                                                    <label>생년월일</label>
                                                </div>
                                                <input type="date"name="memberBirth" class="form-control w-100" >
                                                <div class="fail-feedback">잘못된 날짜를 선택하셨습니다</div>
                                            </div></div>
                                            <div class="row pt-2"><div class="col">
                                                <button type="button"class="btn btn-primary btn-prev">이전</button>
                                                <button type="button"class="btn btn-primary btn-next">다음</button>
                                            </div></div>
                                  </div>
                                   <div class="page col-6 offset-3">
	                                         <div class="row"><div class="col">
	                                            <h3>3단계 연락처/주소</h3>
	                                         </div></div>
                                              <div class="row text-start"><div class="col">
                                                  <div class="ms-2">
                                                      <label>연락처</label>
                                                  </div>
                                                  <input type="tel"name="memberContact" class="form-control w-100" 
                                                       placeholder="- 제외하고 입력" >
                                                  <div class="fail-feedback">전화번호 형식이 올바르지 않습니다</div>
                                              </div></div>
                                              
                                               <div class="row text-start"><div class="col">
                                                   <div class="ms-2">
                                                       <label style="display: block;">주소</label>
                                                   </div>
                                                   <div class="row col-5">
                                                       <div class="col-8">
                                                           <input type="text"name="memberPost" class="form-control post-search" 
                                                                placeholder="우편번호"size="6" maxlength="6"readonly>
                                                       </div>
                                                       <div class="col-4">
                                                           <button type="button" class="btn btn-primary post-search h-100"><i class="fa-solid fa-magnifying-glass"></i></button>
                                                       </div>
                                                   </div>
                                                   <input type="text"name="memberAddr1" class="form-control  w-100 mt-10 post-search" 
                                                        placeholder="기본주소" readonly>
                                                   <input type="text"name="memberAddr2" class="form-control w-100 mt-10" 
                                                        placeholder="상세주소" >
                                                   <div class="fail-feedback">주소 입력시 모든 주소를 작성해주세요</div>
                                               </div></div>
                                                
                                                <div class="row "><div class="col">		    
                                                    <div class="col">
                                                        <button type="button"class="btn btn-primary btn-prev">이전</button>
                                                        <button type="button"class="btn btn-primary btn-next">다음</button>      
                                                        <button class="btn btn-primary w-50">가입하기</button>
                                                    </div>
                                                </div></div>
                                     	</div>
                        			</div>

                        </form>

                    </div>
                </div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>