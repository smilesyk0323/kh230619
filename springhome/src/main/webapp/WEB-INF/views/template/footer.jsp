<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<!--아이콘 사용을 위한 Font Awesome 6 CDN-->
    <link  rel="stylesheet"type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <!--구글 웹 폰트 사용을 위한 CDN-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&display=swap" rel="stylesheet">
    <!--내가 만든 CSS파일-->
    <link rel="stylesheet"type="text/css" href="/css/reset.css">
    <link rel="stylesheet"type="text/css" href="/css/layout.css">
    <link rel="stylesheet"type="text/css" href="/css/commons.css">
<!--     <link rel="stylesheet"type="text/css" href="/css/test.css"> -->
<hr>

	 		<%--
				JSP에서 세션에 저장된 값을 확인하려면  EL의 내장객체를 사용
				sessionScope 내장객체를 사용하면 HttpSession의 값을 조회할 수 있다
				세션ID = ${pageContext.session.id},
		 	    세션값 = ${sessionScope.name}<br>
		 --%>
		<%--구분을 위한 경계선--%>
	        <footer>
            <div class="row flex-container auto-width">
                <div class="left">
                    <a href="#" class="link" style="color:#6460AA">이용약관</a> |
                    <a href="#" class="link" style="color:#6460AA">개인정보취급방침</a> |
                    <a href="#" class="link" style="color:#6460AA">인재채용문의</a> |
                    <a href="#" class="link" style="color:#6460AA">훈련비 게시</a> |
                    <a href="#" class="link" style="color:#6460AA">강사채용</a>
                </div>
                <div class="right">
                    <i class="fa-brands fa-google"  style="color:#6460AA"></i>
                    <i class="fa-brands fa-facebook"  style="color:#6460AA"></i>
                    <i class="fa-brands fa-twitter"  style="color:#6460AA"></i>
                    <i class="fa-brands fa-instagram"  style="color:#6460AA"></i>
                </div>
            </div>
            <div class="row left mv-30"style="color:#6460AA">
                <pre>KH정보교육원 | 사업자등록번호 : 851-87-00622 | 서울 강남 제2014-01호 | 대표자 : 양진선 | 책임자 : 최홍석 | 개인정보관리책임자 : 양진선

강남지원 1관 : 서울특별시 강남구 테헤란로14길 6 남도빌딩 2F, 3F, 4F, 5F, 6F
강남지원 2관 : 서울특별시 강남구 테헤란로10길 9 그랑프리 빌딩 4F, 5F, 7F
강남지원 3관 : 서울특별시 강남구 테헤란로 130 호산빌딩 5F, 6F
종로지원 : 서울특별시 중구 남대문로 120 그레이츠 청계(구 대일빌딩) 2F, 3F
당산지원 : 서울특별시 영등포구 선유동2로 57 이레빌딩(구관) 19F, 20F
Copyright © 1998-2023 KH Information Educational Institute All Right Reserved
                </pre>
            </div>
        </footer>
    </main>
</body>
</html>