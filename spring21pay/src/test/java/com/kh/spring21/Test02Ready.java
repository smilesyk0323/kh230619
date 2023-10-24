package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test02Ready {

	@Test
	public void test() throws URISyntaxException {
		//변하는 정보와 중요한 정보들을 분리하여 모듈로 개발
		
		//결제시마다 변하는 정보 - 상품명, 상품가격, 주문번호, 구매자ID
		String partnerOrderId = UUID.randomUUID().toString();
		String partnerUserId = "testuser1";
		String itemName = "슈퍼 울트라 노트북";
		int itemPrice = 999990;
	
		
		//전송 도구 생성
		RestTemplate template = new RestTemplate();
		
		//주소 설정
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");//요청을 보내고 싶은 주소
		
		//헤더 설정
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK 33152d1cfd367f6dd8c0a928acec99f9");//문자열만 작성가능 
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		//바디 설정
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();//같은 이름인 경우도 저장 가능! 
		body.add("cid","TC0ONETIME");//가맹점 코드(사업자번호)대체 하는 테스트 코드
		body.add("partner_order_id",partnerOrderId);//시퀀스, 랜덤 시리얼 번호 생성(같은번호는 같은 결제!) 
		body.add("partner_user_id",partnerUserId);//회원아이디
		body.add("item_name",itemName);//상품 여러개 일땐 "상품명 외 ?개"로 표기
		body.add("quantity",String.valueOf(itemPrice));//상품수량: 무조건1로 표기 실제 수량은 DB에서 관리
		body.add("total_amount","3000");//상품 총액 
		body.add("tax_free_amount","0");//비과세 
		body.add("approval_url","http://localhost:8080/pay/success");//성공
		body.add("cancel_url","http://localhost:8080/pay/cancel");//취소
		body.add("fail_url","http://localhost:8080/pay/fail");//실패
					
		//요청 발송
		//HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);
		HttpEntity entity = new HttpEntity(body, headers);
		
		Map response = template.postForObject(uri, entity, Map.class);
//		log.debug("reponse = {}", response);
		log.debug("url = {}", response.get("next_redirect_pc_url"));
	}
}
















