        function checkMemberId(){
            var input = document.querySelector("[name=memberId]");
            var regex = /^[a-z0-9]{5,20}/;

            var isValid = regex.test(input.value);/*test객체는 정규표현식만 갖을 수 있다*/
            
            input.classList.remove("success", "fail", "fail2");
            if(isValid){
                //아이디 중복검사 코드 및 성공 실패
                input.classList.add("success");
                return true;
            }
            else{
                input.classList.add("fail");
                return false;
            }

        }
        
        function checkMemberPw(){
            var input = document.querySelector("[name=memberPw]");
            var regex =/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$/;

            var isValid = regex.test(input.value);/*미입력 항목도 잘못된 형식으로 인식*/
            
            input.classList.remove("success", "fail");
            input.classList.add(isValid ? "success" : "fail");//3항연산자로 표현

            return isValid;//위와 같은 결과가 나옴 
        }

        function checkMemberPw2(){
            var input1 = document.querySelector("[name=memberPw]");
            var input2 = document.querySelector("#password-check");

            input2.classList.remove("success", "fail", "fail2");
            if(input1.value.length == 0){//비밀번호 미작성
                input2.classList.add("fail2");
                return false;
            }
            else if(input1.value == input2.value){//비밀번호 일치
                input2.classList.add("success");
                return true;
            }
            else{//비밀번호 불일치
                input2.classList.add("fail");
                return false;
            }
        }

        function checkMemberNickname(){
            var input = document.querySelector("[name=memberNickname]");
            // var regex =  /^[가-힣0-9]{2,10}$/;
            var regex = /^[ㄱ-ㅎㅏ-ㅣ가-힣0-9]{2,10}$/;//ㅋㅋㅋ,ㅎㅎㅎ도 허용하는 정규식

            var isValid = regex.test(input.value);

            input.classList.remove("success", "fail", "fail2");
            if(isValid){
                //중복검사(추후)
                input.classList.add("success");
                return true;
            }
            else{
                input.classList.add("fail");
                return false;
            }
        }

        function checkMemberEmail(){
            var input = document.querySelector("[name=memberEmail]");
            var regex = /^(.*?)@(.*?)$/;//@만 포함되는 형식

            //입력값이 없거나 정규식 표현에 적합하다면
            var isValid =input.value.length == 0 || regex.test(input.value);
            input.classList.remove("success","fail");
            input.classList.add(isValid ? "success" : "fail");
            return isValid;
        }

        function checkMemberContact() {
            var input = document.querySelector("[name=memberContact]");
            var regex = /^010[1-9][0-9]{7}$/;

            var isValid = input.value.length == 0 || regex.test(input.value);

            input.classList.remove("success", "fail");
            input.classList.add(isValid ? "success" : "fail");
            return isValid;
        }

        function checkMemberBirth() {
            var input = document.querySelector("[name=memberBirth]");
            var regex = /^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$/;

            var isValid = input.value.length == 0 || regex.test(input.value);
            input.classList.remove("success", "fail");
            input.classList.add(isValid ? "success" : "fail");
            return isValid;
        }

        function checkMemberAddress() {
            var input1 = document.querySelector("[name=memberPost]");
            var input2 = document.querySelector("[name=memberAddr1]");
            var input3 = document.querySelector("[name=memberAddr2]");

            var isBlank = input1.value.length == 0 && input2.value.length == 0 && input3.value.length == 0;
            var isFill = input1.value.length > 0 && input2.value.length > 0 && input3.value.length > 0;            
            var isValid = isBlank || isFill;//모두 비어 있다 || 모두 채워져있다

            input1.classList.remove("success", "fail");
            input2.classList.remove("success", "fail");
            input3.classList.remove("success", "fail");

            input1.classList.add(isValid ? "success" : "fail");
            input2.classList.add(isValid ? "success" : "fail");
            input3.classList.add(isValid ? "success" : "fail");

            return isValid;
        }

        function checkForm() {
            var result1 = checkMemberId();
            var result2 = checkMemberPw();
            var result3 = checkMemberPw2();
            var result4 = checkMemberNickname();
            var result5 = checkMemberEmail();
            var result6 = checkMemberBirth();
            var result7 = checkMemberContact();
            var result8 = checkMemberAddress();

            return result1 && result2 && result3 && result4 &&
                      result5 && result6 && result7 && result8;
        }