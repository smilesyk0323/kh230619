package oop.setter3;

public class Phone {
	String name;
	String telecom;
	int price;
	int period;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setTelecom(String telecom) {
		switch(telecom){
		case"SK":
		case"KT":
		case"LG":
			this.telecom = telecom;
		}		
	}
	
//	void setPrice(int price) {
//		if (price>0)
//		this.price = price;
//	}
	
	void setPrice(int price) {
		if(price < 0) {
			return;
		}
		this.price = price;
	}
	
	
	void setPeriod(int period) {
		switch(period) {
		case 0:
		case 24:
		case 36:
			this.period = period;
		}
	}
			
	//메소드 오버로딩-주의사항보단 왜! 쓰는지!! 암기~~!! 
	void setup(String name,String telecom,int price) {
		this.setup(name, telecom, price, 0);
	}
	
	void setup(String name,String telecom,int price,int period) {
		this.setName(name);
		this.setTelecom(telecom);
		this.setPrice(price);
		this.setPeriod(period);
	}
	
	
	void show() {
		System.out.println("<휴대폰 요금제>");
		System.out.println("기종: "+ this.name);
		System.out.println("통신사: "+ this.telecom	);
		
		if(period==0) {//약정이 없다면
			int discount = this.price *5 /100;
			int result = this.price - discount;
			System.out.print("판매가: "+ result +"원");
			System.out.println("(원가: "+ this.price +"원)");
			}
		else{//약정이 있다면 		
				int periodPrice = this.price / this.period;
				System.out.print("약정기간: "+this.period+"개월");
				System.out.println("월약정금액: "+ periodPrice +"원");
				}
		if(this.period == 0) {
			System.out.println("약정없음");
		}
		else {
			System.out.println("약정기간: "+ this.period+"개월");
		}
	}
	
}
