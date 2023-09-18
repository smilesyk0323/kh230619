package com.kh.spring13;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.kh.spring13.configuration.EmailProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test03 {
	
	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() {
		
//-------------모듈화로 아래의 코드 불필요-----------------------------------------
		//이메일 발송 코드 
//		JavaMailSenderImpl sender = new JavaMailSenderImpl();
//		sender.setHost(emailProperties.getHost());//업체주소
//		sender.setPort(emailProperties.getPort());//업체포트
//		sender.setUsername(emailProperties.getUsername());//나의 메일계정
//		sender.setPassword(emailProperties.getPassword());//나의 앱비밀번호(비번x)		
		//통신과 관련된 추가 설정
//		Properties props = new Properties();
//		props.setProperty("mail.smtp.auth", "true");//인증 후 이용 설정(필수)
//		props.setProperty("mail.smtp.debug", "true");//디버깅 기능 이용 설정(선택)
//		props.setProperty("mail.smtp.starttls.enable", "true");//TLS 사용 설정(필수)
//		props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");//TLS 버전 설정(필수)
//		props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");//신뢰할 수 있는 대상 설정(필수)
//		sender.setJavaMailProperties(props);
//-------------모듈화로 위의 코드 불필요----------------------------------------------		
			
		
		//전송 메세지 - 상대방의 정보와 메일 내용을 설정
		SimpleMailMessage message = new SimpleMailMessage();	
		message.setTo("smilesyk0323@naver.com");
		message.setSubject("다시");
		message.setText("전송");
		
		//전송
		sender.send(message);
	}

}














