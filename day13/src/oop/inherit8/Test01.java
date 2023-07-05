package oop.inherit8;

public class Test01 {
	public static void main(String[]args) {
		//캐릭터 생성 불가(추상클래스라스)
		Warrior a = new Warrior("배트맨");
		a.show();
		a.attack();
		a.move();
		a.store();
		
		Magician b = new Magician("슈퍼맨");
		b.show();
		b.attack();
		b.move();
		b.store();
		
		Archer c = new Archer("엑스맨");
		c.show();
		c.attack();
		c.move();
		c.store();
		
	}
}
