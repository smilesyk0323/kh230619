
$(function(){
    //상태 객체
    var status = {
        id:false,
        pw:false,
        pwCheck:false,
        nick:false,
        email:false,
        contact:false,
        birth:false,
        addr:false,
        ok:function(){
            return this.id && this.pw && this.pwCheck&&this.nick && this.email 
            && this.contact && this.birth && this.addr;
        },
    };

    $("[name=memberId]").blur(function(){
        var regex =  /^[a-z][a-z0-9]{4,19}$/;
        var isValid = regex.test($(this).val());
        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail"); 
        status.id = isValid;
    });
    $("[name=memberPw]").blur(function(){
        var regex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$/;
        var isValid = regex.test($(this).val());
        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");
         status.pw = isValid;
         //비밀번호 확인창에 강제로 blur이벤트를 발생시킨다(트리거)
         $("#password-check").blur();//너무 많으면 혼돈~ 한 두개 정도에 적용
    });
    $("#password-check").blur(function(){
        var originPw = $("[name=memberPw]").val();
        var checkPw = $(this).val();
        $(this).removeClass("success fail fail2");
        if(originPw.length == 0){//미입력이면
            $(this).addClass("fail2");
            status.pwCheck = false;
        }
        else if(originPw == checkPw){//일치하면
            $(this).addClass("success"); 
            status.pwCheck = true;
        }
        else{//비밀번호 불일치
            $(this).addClass("fail");
            status.pwCheck = false;
        }
    });
    $("[name=memberNickname]").blur(function(){
        var regex =  /^[ㄱ-ㅎㅏ-ㅣ가-힣0-9]{2,10}$/;
        var isValid = regex.test($(this).val());
        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");
         status.nick = isValid;
    });
    $("[name=memberEmail]").blur(function(){
        var regex =  /^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/;
        var isValid =$(this).val() == "" || regex.test($(this).val());
        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");
         status.email = isValid;
    });
    $("[name=memberContact]").blur(function(){
        var regex =  /^010[1-9][0-9]{7}$/;
        var contact = $(this).val();
        var isValid =contact.length == 0 || regex.test(contact);
        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");
         status.contact = isValid;
    });
    $("[name=memberBirth]").blur(function(){
        var regex =  /^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$/;
        var isValid =$(this).val().length == 0 || regex.test($(this).val());
        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");
         status.birth = isValid;
    });
    $("[name=memberPost],[name=memberAddr1],[name=memberAddr2]").blur(function(){
        //this 사용 불가(확실히 누군지 알 수 없음)-수동으로 선택해줘야함
        var post =  $("[name=memberPost]").val();
        var addr1 = $("[name=memberAddr1]").val();
        var addr2 = $("[name=memberAddr2]").val();
        var isBlank = post.length == 0 && addr1.length == 0 && addr2.length == 0;
        var isFill = post.length > 0 && addr1.length > 0 && addr2.length > 0;            
        var isValid = isBlank || isFill;
        $("[name=memberPost],[name=memberAddr1],[name=memberAddr2]").removeClass("success fail");
        $("[name=memberPost],[name=memberAddr1],[name=memberAddr2]").addClass(isValid ? "success" : "fail");
         status.addr = isValid;
    });
    
 //페이지 이탈 방지 
            //- window에 beforeunload 이벤트 설정
            $(window).on("beforeunload",function(){
                return false;
            });

    $(".join-form").submit(function(e){//기본이벤트가 있는 코드라 "e"가 필요
        $(".form-input").blur();
        if(!status.ok()){
            e.preventDefault();
        }
        else{
            $(window).off("beforeunload")
        }
    });


});