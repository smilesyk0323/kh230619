package oop.inherit8;

//두 개의 캐릭터로 서로간의 전투를 하도록 처리하는  클래스 
//- ex: 거래 / 전투 / ...
public class interaction {
		
		//전투 기능
	public static void battle(Warrior a, Warrior b) {
		a.attack();
		b.attack();
	}
}
