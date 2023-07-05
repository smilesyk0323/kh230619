package oop.inherit6;

public class Iphone13 extends Iphone{


	public Iphone13(String number, String color) {
		super(number, color);
	}

	@Override
	public void call() {
		System.out.println("Iphone13 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("Iphone13 문자 기능 실행");
	}
	
	@Override
	public void siri() {
		System.out.println("Iphone13 음성인식 기능 실행");
	}
	
	public void itunes() {
		System.out.println("Iphone13 아이튠즈 기능 실행");
	}
	


}
