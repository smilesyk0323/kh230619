package oop.method3;

public class Mobile {
	String mobile;
	String name;
	int price;
	int data;
	int min;
	int count;
	
	void show() {
		System.out.print("통신사: "+this.mobile);
		System.out.print("상품명: "+this.name);
		System.out.print("월정액: "+this.price);
		System.out.print("데이터(GB): "+this.data);
		System.out.print("통화(분): "+this.min);
		System.out.println("문자(건): "+this.count);
	
	}
	
	void setup(String mobile, String name,int price, int data, int min, int count) {
		this.mobile = mobile;
		this.name = name;
		this.price = price;
		this.data = data;
		this.min = min;
		this.count = count;
	}
}
