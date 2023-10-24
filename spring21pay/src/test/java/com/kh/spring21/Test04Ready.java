package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring21.configuration.KakaoPayProperties;
import com.kh.spring21.vo.KakaoPayReadyRequestVO;
import com.kh.spring21.vo.KakaoPayReadyResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04Ready {
	
	@Autowired
	private KakaoPayProperties kakaoPayProperties;

	@Test
	public void test() throws URISyntaxException {
		//변하는 정보와 중요한 정보들을 분리하여 모듈로 개발
		
		//결제 준비 요청 정보를 클래스로 모듈화(KakaoPayReadyRequestVO)
		KakaoPayReadyRequestVO request = KakaoPayReadyRequestVO.builder()
					.partnerOrderId(UUID.randomUUID().toString())
					.partnerUserId("testuser1")
					.itemName("초코파이 1box")
					.itemPrice(3500)
					.build();
		
		//전송 도구 생성
		RestTemplate template = new RestTemplate();
		
		//(+추가) SNAKE_CASE를 CAMEL_CASE로 처리하도록 추가 도구를 설정
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
//		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//		converter.setObjectMapper(mapper);	
//		template.getMessageConverters().add(0, converter);
		
		//주소 설정
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");//요청을 보내고 싶은 주소
		
		//헤더 설정
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK "+kakaoPayProperties.getKey());//문자열만 작성가능 
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		//바디 설정
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();//같은 이름인 경우도 저장 가능! 
		body.add("cid",kakaoPayProperties.getCid());//가맹점 코드(사업자번호)대체 하는 테스트 코드
		body.add("partner_order_id",request.getPartnerOrderId());//시퀀스, 랜덤 시리얼 번호 생성(같은번호는 같은 결제!) 
		body.add("partner_user_id",request.getPartnerUserId());//회원아이디
		body.add("item_name",request.getItemName());//상품 여러개 일땐 "상품명 외 ?개"로 표기
		body.add("quantity","1"); //상품수량: 무조건1로 표기 실제 수량은 DB에서 관리
		body.add("total_amount",String.valueOf(request.getItemPrice()));//상품 총액
		body.add("tax_free_amount","0");//비과세 
		body.add("approval_url","http://localhost:8080/pay/success");//성공
		body.add("cancel_url","http://localhost:8080/pay/cancel");//취소
		body.add("fail_url","http://localhost:8080/pay/fail");//실패
					
		//요청 발송
		//HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);
		HttpEntity entity = new HttpEntity(body, headers);
		
//		Map response = template.postForObject(uri, entity, Map.class);
		KakaoPayReadyResponseVO response = 
				template.postForObject(uri, entity, KakaoPayReadyResponseVO.class);
		log.debug("reponse = {}", response);
		log.debug("url = {}", response.getNextRedirectPcUrl());
	}
}
















