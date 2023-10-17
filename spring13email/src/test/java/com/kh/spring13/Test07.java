package com.kh.spring13;

import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07 {

	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() throws MessagingException, IOException {
		//목표 : 이메일에 첨부파일 넣고 전송하기
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
		
		helper.setTo(new String[] {"smilesyk0323@naver.com"});
		helper.setSubject("첨부파일 테스트");
		helper.setText("첨부파일 확인해주세요!");
		
		//첨부파일을 찾아서 메일을 추가
		ClassPathResource resource = new ClassPathResource("static/images/wen.png");
		helper.addAttachment("Pocketmon", resource);
//		helper.addAttachment(resource.getFilename(), resource);
		
		//첨부파일을 여러개 보낼때
		// 여러 개의 첨부 파일을 배열 또는 목록으로 정의
//        ClassPathResource[] resources = new ClassPathResource[]{
//            new ClassPathResource("static/images/wen.png"),
//            new ClassPathResource("static/images/another.png"),
//            new ClassPathResource("static/images/yetanother.png")
//        };

        // 반복문을 통해 각 파일을 추가
//        for (ClassPathResource resource : resources) {
//            helper.addAttachment(resource.getFilename(), resource);
//        }
		
		sender.send(message);
	}
}












