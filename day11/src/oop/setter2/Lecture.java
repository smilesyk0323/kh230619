package oop.setter2;

public class Lecture {
	
	String name;
	int time;
	int price;
	String type;
  
	void setup(String name, int time, int price, String type) {
		this.setName(name);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
	
	void setName(String name) {
			this.name = name;
	}
	
	void setTime(int time) {
		if(time > 0 && time % 30 == 0) {
			this.time = time;
			}
		}
	
//	void setPrice(int price) {
//		if(price >=0) {
//			this.price = price;
//		}
//	}
	void setPrice(int price) {
		if(price<0) {
			return;//반환은 없지만 중지하세요 ==반복문의 break와 같은효과 break사용불가
		}
		this.price = price;// 조건이 많을때 return사용 
	}
	void setType(String type) {
		switch(type) {
		case"온라인":
		case"오프라인":
		case"혼합":
			this.type = type;
		}
	}
		

	
	void show() {
		System.out.println("<강좌정보>");
		System.out.println("강좌명:"+this.name);
		System.out.println("강의시간:"+this.time +"시간");
		System.out.println("수강료: "+this.price+"원");
		System.out.println("유형: " + this.type );
	}
	

}
