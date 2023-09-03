
function checkMemberId() {
    var input = document.querySelector("[name=memberId]");
    var regex = /^[a-z0-9]{5,20}$/;

    input.classList.remove("success","fail");
    if(regex.test(input.value)){
        input.classList.add("success");
        return true;
    }
    else{
        input.classList.add("fail");
        return false;
    }
}

function checkMemberPw() {
    var input = document.querySelector("[name=memberPw]");

    var regex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$/;
    var isValid = regex.test(input.value);

    input.classList.remove("success", "fail");
    if(regex.test(input.value)){
        input.classList.add("success");
        return true;
    }
    else{
        input.classList.add("fail");
        return false;
    }
}

function checkMemberPw2() {
    var pw = document.querySelector("[name=memberPw]");
    var pwCheck = document.querySelector("#password-check");

    //var isValid = 비밀번호가 1글자이상 입력되어 있고 두 입력값이 같으면;
    var isValid = pw.value.length >= 1 && pw.value == pwCheck.value;

    pwCheck.classList.remove("success", "fail", "fail2");
    if(pw.value.length == 0){
        pwCheck.classList.add("fail2");
        return false;
    }
    else if(isValid) {
        pwCheck.classList.add("success");
        return true;
    }
    else {
        pwCheck.classList.add("fail");
        return false;
    }
}
function checkMemberNick() {
    var input = document.querySelector("[name=memberNickname]");
    var regex = /^[가-힣0-9]{2,10}$/;

    input.classList.remove("success","fail");
    if(regex.test(input.value)){
        input.classList.add("success");
        return true;
    }
    else{
        input.classList.add("fail");
        return false;
    }
}

//폼 검사는 기존 검사 함수를 불러 결과를 받아 반환하도록 구현
function checkForm(){
    // return checkMemberId() && checkMemberPw(); 하나만 실행해서 결과를 알려줌

    var r1 = checkMemberId();
    var r2 = checkMemberPw();
    var r3 = checkMemberPw2();
    var r4 = checkMemberNick();
    return r1&& r2&&r3&&r4;
}