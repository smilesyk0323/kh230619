package oop.setter2_1;

public class Group {
	String name;
	int time, money;
	String type;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getTime() {
		return time;
	}
	void setTime(int time) {
		if(time % 30 ==0) {
			this.time = time;
		}
	}
	int getMoney() {
		return money;
	}
	void setMoney(int money) {
		if(money>0) {
			this.money = money;
		}
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		}
	}
	
	Group(String name, int time, int money, String type	){
		this.setName(name);
		this.setTime(time);
		this.setMoney(money);
		this.setType(type);
	}
	
	void show() {
		System.out.println("<강좌정보>");
		System.out.println("강좌명: "+this.name);
		System.out.println("강의시간: "+ this.time);
		System.out.println("수강료: "+ this.money);
		System.out.println("수강종류: "+this.type);
	}
}
