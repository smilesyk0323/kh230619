package oop.inherit8;

public class Test01 {
	public static void main(String[]args) {
		//캐릭터 생성 불가(추상클래스라스)
		Warrior a = new Warrior("전사");
		a.show();
		a.attack();
		a.move();
		a.store();
		
		Magician b = new Magician("마법사");
		b.show();
		b.attack();
		b.move();
		b.store();
		
		Archer c = new Archer("궁수");
		c.show();
		c.attack();
		c.move();
		c.store();
		
	}
}
