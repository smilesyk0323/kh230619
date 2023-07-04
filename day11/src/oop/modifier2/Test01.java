package oop.modifier2;

public class Test01 {
	public static void main(String[]args) {
		Member a = new Member("유재석",3,15,100,1500);
		Member b = new Member("강호동",2,5,50,250);
		Member c = new Member("신동엽",2,8,80,1000);
		
		a.show();
		
		a.next();
		a.next();
		
		a.show();
		b.show();
		c.show();
		
	}
}
