package oop.method3;

public class Mobile {
	//멤버 필드
	String mobile;
	String name;
	int price;
	int data;
	int min;
	int count;//멤버변수
	
	//멤버 메소드
	void setup(String mobile, String name,int price,
			int data, int min, int count) {//매개변수
		this.mobile = mobile;
		this.name = name;
		this.price = price;
		this.data = data;
		this.min = min;
		this.count = count;//지역변수
		}
	
	void show() {
		System.out.println("<요금제 정보>");
		System.out.println("통신사: "+this.mobile);
		System.out.println("상품명: "+this.name);
		System.out.println("월정액: "+this.price);
		System.out.println("데이터(GB): "+this.data);
		System.out.println("통화(분): "+this.min);
		System.out.println("문자(건): "+this.count+"\n");
		}
}
