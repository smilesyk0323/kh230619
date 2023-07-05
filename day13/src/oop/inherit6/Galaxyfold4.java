package oop.inherit6;

//클래스에 final이 붙으면 이후의 상속이 불가능
public final class Galaxyfold4 extends Galaxy{
	
	//고유필드

	public Galaxyfold4(String number, String color) {
		super(number, color);
	}

	//고유기능
	public void iris() {
		System.out.println("갤럭시폴드4 홍채인식 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("갤럭시폴드4 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시폴드4 문자 기능 실행");
	}
	
	@Override
	public void samsungPay() {
		System.out.println("갤럭시폴드4 삼성페이 기능 실행");
	}
		
	

}
