package oop.setter3_1;

public class Test01 {
	public static void main(String[]args) {
		Mobile a = new Mobile("갤럭시23s","SK",180);
		Mobile b = new Mobile("갤럭시23s","KT",175,24);
		Mobile c = new Mobile("아이폰14","LG",200,30);
		Mobile d = new Mobile("아이폰14","SK",199);
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}
