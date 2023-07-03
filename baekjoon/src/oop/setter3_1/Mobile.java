package oop.setter3_1;

public class Mobile {

	String phone, telecom;
	int price;
	int month;
	
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getTelecom() {
		return telecom;
	}
	void setTelecom(String telecom) {
		switch(telecom) {
		case"SK":
		case"KT":
		case"LG":
			this.telecom = telecom;
		}
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		if(price>0) {
			this.price = price;
		}
	}
	int getMonth() {
		return month;
	}
	void setMonth(int month) {
		switch(month) {
		case 0:
		case 24:
		case 36:
			this.month = month;
		}
	}
	
	Mobile(String phone, String telecom, int price){
		this(phone, telecom,price,0);
	}
	Mobile(String phone, String telecom, int price, int month){
		this.setPhone(phone);
		this.setTelecom(telecom);
		this.setPrice(price);
		this.setMonth(month);
	}
	double getPay() {
		return this.price / this.month;
	}
	
	int getEvent() {
		return this.price * 95 /100;
	}
	
	void show() {
		System.out.println("휴대폰 판매정보");
		System.out.println("기종: ");
		System.out.println("통신사: ");
		if(month>0) {
			if(month==24) {
				System.out.println("가격: "+this.price+"만원");
				System.out.println("약정기간: "+this.month+"개월"+"월납부금액: "+this.getPay()+"만원");
			}
			else if(month==36){
				System.out.println("가격: "+this.price+"만원");
				System.out.println("약정기간: "+this.month+"개월"+"월납부금액: "+this.getPay()+"만원");
			}
			else {
				System.out.println("할인가격: "+this.getEvent()+"만원");
				System.out.println("정상가")
			}
		}
	}
}
