package oop.inherit6;

//최상위 클래스 - 휴대폰 //필드 ->세터,게터-> 생성자
public class Phone {
	//공통 필드 - 접근제한(private/protected)
	protected String number;
	protected String color;
	//setter&getter생성
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//공통메소드
	public void call() {
		System.out.println("전화기능 실행");
	}
	public void sms() {
		System.out.println("문자기능 실행");
	}
	
	//생성자
	public Phone(String number,String color) {
		this.setNumber(number);
		this.setColor(color);
	}
	
	//출력 메소드 - final 재정의 금지 처리 
	public final void show() {
		System.out.println("<휴대폰 정보>");
		System.out.println("번호: "+ this.number);
		System.out.println("색상: "+this.color);
	}
	
	

}
