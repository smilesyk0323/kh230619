package oop.method5;

public class Test01 {
	public static void main(String[]args) {
		Menu2 a = new Menu2();
		Menu2 b = new Menu2();
		Menu2 c = new Menu2();
		Menu2 d = new Menu2();
		
		a.setup("참이슬후레쉬", "주류", 1200,true,true);
		b.setup("클라우드맥주", "주류", 3000,false,true);
		c.setup("바나나킥", "과자", 1500,false,true);
		d.setup("허니버터칩", "과자", 2000,true,false);
		
		a.show();
		b.show();
		c.show();
		d.show();
		
	}

}
