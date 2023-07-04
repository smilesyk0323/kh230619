package oop.keyword6;

public class Test01 {
	public static void main(String[]args) {
		Id a = new Id("adminuser","admin1234","관리자");
		Id b = new Id("student","student1234","수강생");
		Id c = new Id("manager","manager1234","매니저");
		
		a.show();
		b.show();
		c.show();
		
	}
}
