<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<style>
        .form-control:focus {
            color: var(--bs-body-color);
            background-color: var(--bs-body-bg);
            border-color: #bce1d6;
            outline: 0;
            box-shadow: 0 0 0 0.125rem rgba(120, 194, 173, 0.25);
        }
</style>
<body style="background-color:#F2EFFB">

 <div class="rowmb-5 pb-5">
                           <div class="col">
                               <form action="login" method="post" autocomplete="off">
                                   <div class="mt-5 text-center col-4 offset-4">
                                       <div class="row">
                                           <h2>로그인</h2>
                                       </div>
                                       <div class="row mt-4 mb-3 ">
                                           <input type="text" name="memberId"class="form-control w-100 p-3"
                                               placeholder="아이디">
                                       </div>
                                       <div class="row mt-2 mb-3 ">
                                           <input type="password" name="memberPw" class="form-control w-100 p-3"
                                               placeholder="비밀번호">
                                           
                                       </div>
                                       <div class="row ">
                                           <div class="col text-start form-check form-switch ms-1">
                                               <input class="form-check-input" type="checkbox" id="flexSwitchCheckDefault" name="remember">
                                               <label class="form-check-label" for="flexSwitchCheckDefault">아이디 기억하기</label>

                                           </div>
                                       </div>
                                       <div class="row mt-4 ">
                                           <button class="btn btn-primary p-2">Login</button>
                                       </div>
                                       <div class="row text-end mt-2">
                                           <a href="#" class=" link-underline link-underline-opacity-0 link-underline-opacity-75-hover bs-danger-bg-subtle">비밀번호 찾기</a>
                                       </div>
                                   </div>
                           </form>

                           </div>
                       </div>

<%-- -- if(주소에 파라미터 중 error라는 녀석이 있다면 ){
	<h3>아이디 또는 비밀번호가 일치하지 않습니다</h3>
}--%> 


<%--
	EL은 출력을 쉽게하기 위한 언어이므로 여러 데이터를 쉽게 접근할 수 있다 
	파라미터를 읽고 싶을 경우 param이라는 내장객체(기본아이템)를 사용할 수 있다
	param을 이용하여 파라미터를 비교할 수 있다
	 --%>
<c:if test="${param.error != null}">
		<h3 style="color:red">아이디 또는 비밀번호가 일치하지 않습니다</h3>
</c:if>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



















