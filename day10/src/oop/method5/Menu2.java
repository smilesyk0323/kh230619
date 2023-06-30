package oop.method5;

public class Menu2 {
	String name;
	String type;
	int price;
	boolean deliver;
	boolean event;
	
	//setup을 두 종류로 구현(메소드 오버로딩,method overloading)
	
	void setup(String name, String type, int price) {
		this.setup(name,type,price,false,false);
	}
//	void setup(String name, String type, int price, boolean deliver) {
//		this.name = name;
//		this.type = type;
//		this.price = price;
//		this.deliver = deliver;
//	}
	void setup(String name, String type, int price, boolean deliver, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.deliver = deliver;
		this.event = event;
	}
	
	void show() {
		System.out.println("<상품정보>");
		System.out.println("상품명: "+this.name);
		System.out.println("상품분류: "+this.type);
		if(this.event) {
			System.out.print("행사가: "+price*90/100+"원");
			System.out.print("(원래가격: "+this.price+"원)");
			System.out.println();
		}
		else {
			System.out.println("가격: "+this.price+"원");
		}
		if(this.deliver) {
			System.out.print("새벽배송가능(+2500원)");
			System.out.println();
			}
		else {
			System.out.println("새벽배송불가");
			}
	}
	

}
