package com.kh.spring21.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring21.dao.PaymentDao;
import com.kh.spring21.dao.ProductDao;
import com.kh.spring21.dto.PaymentDetailDto;
import com.kh.spring21.dto.PaymentDto;
import com.kh.spring21.dto.ProductDto;
import com.kh.spring21.service.KakaoPayService;
import com.kh.spring21.vo.KakaoPayApproveRequestVO;
import com.kh.spring21.vo.KakaoPayApproveResponseVO;
import com.kh.spring21.vo.KakaoPayCancelRequestVO;
import com.kh.spring21.vo.KakaoPayCancelResponseVO;
import com.kh.spring21.vo.KakaoPayDetailRequestVO;
import com.kh.spring21.vo.KakaoPayDetailResponseVO;
import com.kh.spring21.vo.KakaoPayReadyRequestVO;
import com.kh.spring21.vo.KakaoPayReadyResponseVO;
import com.kh.spring21.vo.PurchaseListVO;
import com.kh.spring21.vo.PurchaseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/pay")
public class KakaoPayController {
	
	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Autowired
	private PaymentDao paymentDao;
	
	@GetMapping("/test1")
	public String test1() {
		return "pay/test1";
	}
	@PostMapping("/test1")
	public String test1(@ModelAttribute KakaoPayReadyRequestVO request,
				HttpSession session) throws URISyntaxException {
		request.setPartnerOrderId(UUID.randomUUID().toString());
		KakaoPayReadyResponseVO response = kakaoPayService.ready(request);
		
		//session에 flash value를 저장(잠시 쓰고 지우는 데이터)
		//- 사용자를 거치지 않는 범위 내에서 사용해야 안전하게 쓸 수 있다
		session.setAttribute("approve", KakaoPayApproveRequestVO.builder()
					.partnerOrderId(request.getPartnerOrderId())
					.partnerUserId(request.getPartnerUserId())
					.tid(response.getTid())
				.build());
		
		return "redirect:"+ response.getNextRedirectPcUrl();
	}
	
	@GetMapping("/test1/success")
	public String test1Success(HttpSession session, @RequestParam String pg_token) throws URISyntaxException {
		
		//session에 저장되어 있는 flash value를 꺼내어 pg_token을 추가한 뒤 승인 요청
		KakaoPayApproveRequestVO request = 
								(KakaoPayApproveRequestVO) session.getAttribute("approve");
		session.removeAttribute("approve");//flash value 쓰고 바로 삭제
		
		request.setPgToken(pg_token);//토큰 추가

		//결제 승인 요청
		KakaoPayApproveResponseVO response = kakaoPayService.approve(request);
		
		return "redirect:successResult";
		
	}
	@GetMapping("/test1/successResult")
	public String successResult() {
		return "pay/successResult";
	}
	
	@GetMapping("/test1/detail")
	public String detail(Model model, @RequestParam String tid) throws URISyntaxException {
		
		KakaoPayDetailResponseVO response = 
				kakaoPayService.detail(KakaoPayDetailRequestVO.builder().tid(tid).build());
			model.addAttribute("vo",response);
		return "pay/detail";
	}
	
	@RequestMapping("/test1/cancel")
	public String cancel(@ModelAttribute KakaoPayCancelRequestVO request) throws URISyntaxException {
		KakaoPayCancelResponseVO response = kakaoPayService.cancel(request);
		return "redirect:detail?tid="+request.getTid();
	}
	
	//---[ test2 ]------------------------------------------------------------------------
	@Autowired
	private ProductDao productDao;
	
	
	@RequestMapping("/test2")
	   public String test2(Model model) {
	      model.addAttribute("list", productDao.selectList());
	      return "pay2/home";
	   }
	   
	   @GetMapping("/test2/purchase")
	   public String purchase(HttpSession session, @RequestParam int productNo) throws URISyntaxException {
	      //상품정보 조회
	      ProductDto productDto = productDao.selectOne(productNo);
	      //상품정보를 이용하여 결제준비요청 
	      
	      KakaoPayReadyRequestVO request = KakaoPayReadyRequestVO.builder()
	            .itemName(productDto.getProductName())
	            .itemPrice(productDto.getProductPrice())
	            .partnerOrderId(UUID.randomUUID().toString())
	            .partnerUserId("testuser1")
	            .build();
	      
	      KakaoPayReadyResponseVO response = kakaoPayService.ready(request);
	      
	      //session에 flash value를 저장(잠시 쓰고 지우는 데이터)
	      //- 사용자를 거치지 않는 범위 내에서 사용해야 안전하게 쓸 수 있다.
	      
	      //객체로 넣기
	      session.setAttribute("approve", KakaoPayApproveRequestVO.builder()
	            .partnerOrderId(request.getPartnerOrderId())
	            .partnerUserId(request.getPartnerUserId())
	            .tid(response.getTid())
	            .build());
	      session.setAttribute("productNo", productNo);
	      
	      //결제페이지를 사용자에게 안내
	      return "redirect:"+response.getNextRedirectPcUrl();
	   }
	
	//결제 성공 
	@GetMapping("/test2/purchase/success")
	public String test2Success(HttpSession session, @RequestParam String pg_token) throws URISyntaxException {
		//session에 저장되어 있는 flash value를 꺼내어 pg_token을 추가한 뒤 승인 요청
				KakaoPayApproveRequestVO request = 
										(KakaoPayApproveRequestVO) session.getAttribute("approve");
				int productNo = (int) session.getAttribute("productNo");
				session.removeAttribute("approve");//flash value 쓰고 바로 삭제
				session.removeAttribute("productNo");
				
				request.setPgToken(pg_token);//토큰 추가

				//결제 승인 요청
				KakaoPayApproveResponseVO response = kakaoPayService.approve(request);			
				
				//결제 승인이 완료되었다면 DB에 결제 정보를 저장
				int paymentNo = paymentDao.sequence();
				paymentDao.insert(PaymentDto.builder()
							.paymentNo(paymentNo)
							.paymentMember(response.getPartnerUserId())
							.paymentTid(response.getTid())
							.paymentName(response.getItemName())
							.paymentPrice(response.getAmount().getTotal())
							.paymentRemain(response.getAmount().getTotal())
						.build());
				
				return "redirect:successResult";
	}
	
	@RequestMapping("/test2/purchase/successResult")
	public String test2SuccessResult() {
		return "pay2/successResult";
	}
	//-------[ Test3 ]-----------------------------------------------------------------------
	
	@RequestMapping("/test3")
	public String test3(Model model) {
		model.addAttribute("list", productDao.selectList());
		return "pay3/home";
	}
	
	@PostMapping("/test3/purchase")
	public String test3Purchase(HttpSession session,@ModelAttribute PurchaseListVO listVO) throws URISyntaxException {
		log.debug("listVO = {}", listVO);
		
		//listVO에 들어있는 product 항목들을 이용해서 결제 준비 요청 처리 후 결제 페이지로 안내
		//- 결제 이름은 "대표 상품명 외 ?개" 와 같이 작성 
		//- 결제 금액은 모든 상품의 가격과 수량의 총합계
		//- 결론적으로 만들어야 하는 데이터는 KakaoPayReadyRequestVO
		KakaoPayReadyRequestVO request = kakaoPayService.convert(listVO);
		request.setPartnerUserId("testuser1");
		KakaoPayReadyResponseVO response = kakaoPayService.ready(request);
		
		//session에 flash value를 저장(잠시 쓰고 지우는 데이터)
	      //- 사용자를 거치지 않는 범위 내에서 사용해야 안전하게 쓸 수 있다.
	      
	      //객체로 넣기
	      session.setAttribute("approve", KakaoPayApproveRequestVO.builder()
	            .partnerOrderId(request.getPartnerOrderId())
	            .partnerUserId(request.getPartnerUserId())
	            .tid(response.getTid())
	            .build());//승인요청을 위한 준비데이터 --> 카카오페이
	      session.setAttribute("listVO", listVO);//구매한 상품의 번호와 수량 목록 --> 우리DB
		
		return "redirect:"+response.getNextRedirectPcUrl();
	}
	
	@GetMapping("/test3/purchase/success")
	public String test3Success(HttpSession session, @RequestParam String pg_token) throws URISyntaxException {
		//session에 저장한 flash value 추출 및 삭제 
		KakaoPayApproveRequestVO request = 
					(KakaoPayApproveRequestVO)session.getAttribute("approve");
		PurchaseListVO listVO = (PurchaseListVO) session.getAttribute("listVO");
		
		session.removeAttribute("approve");
		session.removeAttribute("listVO");
		
		request.setPgToken(pg_token);//토큰 설정
		KakaoPayApproveResponseVO response = kakaoPayService.approve(request);//승인요청
		
		//DB작엄
		//- 상품을 3개 구매했다면 payment 1회, payment_detail 3회의 insert가 필요(N+1)
		
		//[1]결제번호 생성
		int paymentNo = paymentDao.sequence();
		//[2]결제정보등록
		paymentDao.insert(PaymentDto.builder()
					.paymentNo(paymentNo)//결제고유번호
					.paymentMember(response.getPartnerUserId())//결제자ID
					.paymentTid(response.getTid())//PG사 거래번호
					.paymentName(response.getItemName())//PG사 결제상품명
					.paymentPrice(response.getAmount().getTotal())//총 결제액
					.paymentRemain(response.getAmount().getTotal())//총 취소가능액
				.build());
		//[3]상품개수만큼 결제 상세정보를 등록
		List<PurchaseVO> list = listVO.getProduct();
		for(PurchaseVO vo : list) {
			ProductDto productDto = productDao.selectOne(vo.getProductNo());//상품정보 조회
			paymentDao.insertDetail(PaymentDetailDto.builder()
						.paymentDetailOrigin(paymentNo)//상위결제번호
						.paymentDetailProduct(vo.getProductNo())//상품	번호(vo, productDto)
						.paymentDetailProductName(productDto.getProductName())//상품명(productDto)
						.paymentDetailProductPrice(productDto.getProductPrice())//상품가격(productDto)
						.paymentDetailProductQty(vo.getQty())//구매수량(vo)
					.build());
		}
		
		return "redirect:successResult";
	}
	
	
}





















