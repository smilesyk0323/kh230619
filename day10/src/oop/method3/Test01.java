package oop.method3;

public class Test01 {
	public static void main(String[]args) {
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();
		
		m1.setup("SK","5G언택트 52",52000,200,1000,2000);
		m2.setup("KT", "5G세이브", 45000,100,900, 1500);
		m3.setup("LG","5G시그니처", 130000,500,2000,2500);
		
		m1.show();
		m2.show();
		m3.show();
	}

}
