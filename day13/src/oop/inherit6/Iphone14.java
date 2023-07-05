package oop.inherit6;

public class Iphone14 extends Iphone{


	public Iphone14(String number, String color) {
		super(number, color);
	}

	@Override
	public void call() {
		System.out.println("Iphone14 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("Iphone14 문자 기능 실행");
	}
	@Override
	public void siri() {
		System.out.println("Iphone14 음성인식 기능 실행");
	}
	
	public void facetime() {
		System.out.println("Iphone14 영상통화 기능 실행");
	}


}
