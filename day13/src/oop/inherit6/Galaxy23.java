package oop.inherit6;

public class Galaxy23 extends Galaxy{
	
	//고유필드
	public Galaxy23(String number, String color) {
		super(number, color);
	}

	//고유기능 
	public void bixby() {
		System.out.println("갤럭시23s 음성인식 기능 실행");
	}
	
	@Override
	public void call() {
		System.out.println("갤럭시23s 전화기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시23s 문자기능 실행");
	}
	
	
	
	@Override
	public void samsungPay() {
		System.out.println("갤럭시23s 삼성페이 기능 실행");
	}
	



}
