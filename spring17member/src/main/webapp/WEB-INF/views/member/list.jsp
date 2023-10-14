<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<form>
	<div>회원 아이디 <input type="text"name="memberId"value="${vo.memberId}"></div>
	<div>회원 닉네임<input type="text" name="memberNickname"value="${vo.memberNickname}"></div>
	<div>회원 연락처 <input type="text"name="memberContact"value="${vo.memberContact}"></div>
	<div>회원 주소 <input type="text"name="memberAddr1"value="${vo.memberAddr1}"></div>
	<div>
		회원 생일 <input type="date" name="memberBirthBegin"value="${vo.memberBirthBegin}">
		~
		<input type="date" name="memberBirthEnd"value="${vo.memberBirthEnd}">
	</div>
	<div>
		회원 가입일 
			<input type="date" name="memberJoinBegin"value="${vo.memberJoinBegin}"> ~
			<input type="date" name="memberJoinEnd"value="${vo.memberJoinEnd}">
	</div>
	<div>
		회원 마지막 로그인 
			<input type="date" name="memberLoginBegin"value="${vo.memberLoginBegin}"> ~
			<input type="date" name="memberLoginEnd"value="${vo.memberLoginEnd}">
	</div>
	<div>
		회원 마지막 비밀번호 변경일
			<input type="date" name="memberChangeBegin"value="${vo.memberChangeBegin}"> ~
			<input type="date" name="memberChangeEnd"value="${vo.memberChangeEnd}">
	</div>		
	<div>
		회원 포인트 
			<input type="number" name="memberPointMin"value="${vo.memberPointMin}">점 이상 ~
			<input type="number" name="memberPointMax"value="${vo.memberPointMax}">점 이하
	</div>
	<div>
		회원 등급 
		<c:choose>
			<c:when test="${vo.memberLevelList.contains('일반')}">
				<input type="checkbox" name="memberLevelList" value="일반"checked> 일반
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="memberLevelList" value="일반"> 일반
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.memberLevelList.contains('VIP')}">
				<input type="checkbox" name="memberLevelList" value="VIP"checked> VIP
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="memberLevelList" value="VIP"> VIP
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.memberLevelList.contains('VVIP')}">
				<input type="checkbox" name="memberLevelList" value="VVIP"checked> VVIP
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="memberLevelList" value="VVIP"> VVIP
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.memberLevelList.contains('관리자')}">
				<input type="checkbox" name="memberLevelList" value="관리자"checked> 관리자
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="memberLevelList" value="관리자"> 관리자
			</c:otherwise>
		</c:choose>
	</div>
	
	<!-- 정렬 -->
	<div>
		1차 정렬
		<select name="orderList">
			<option value="">선택하세요</option>
			<option value="member_point asc">포인트 순</option>
			<option value="member_join asc">가입일자가 오래된 순</option>
			<option value="member_login asc">장기간 로그인 안한 순</option>
			<option value="member_change desc">비밀번호 변경한지 오래된 순</option>
		</select>
	</div>
	<div>
		2차 정렬
		<select name="orderList">
			<option value="">선택하세요</option>
			<option value="member_point asc">포인트 순</option>
			<option value="member_join asc">가입일자가 오래된 순</option>
			<option value="member_login asc">장기간 로그인 안한 순</option>
			<option value="member_change desc">비밀번호 변경한지 오래된 순</option>
		</select>
	</div>
	
	
	<button type="submit">검색</button>
</form>

<hr>

<table border="1">
	<thead>
		<tr>
			<th>아이디</th>
			<th>닉네임</th>
			<th>연락처</th>
			<th>이메일</th>
			<th>주소</th>
			<th>포인트</th>
			<th>가입일</th>
			<th>마지막 로그인 일자</th>
			<th>마지막 비밀번호 변경 일자</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="memberDto" items="${list}">
		<tr>
			<td>${memberDto.memberId}</td>
			<td>${memberDto.memberNickname}</td>
			<td>${memberDto.memberContact}</td>
			<td>${memberDto.memberEmail}</td>
			<td>[${memberDto.memberPost}] ${memberDto.memberAddr1} ${memberDto.memberAddr2}</td>
			<td>${memberDto.memberPoint}</td>
			<td><fmt:formatDate value="${memberDto.memberJoin}" pattern="yyyy-MM-dd" /></td>
            <td><fmt:formatDate value="${memberDto.memberLogin}" pattern="yyyy-MM-dd" /></td>
            <td><fmt:formatDate value="${memberDto.memberChange}" pattern="yyyy-MM-dd" /></td>
		</tr>
	</c:forEach>
	</tbody>
</table>

		