package oop.inherit8;

public class Test02 {
	public static void main(String[]args) {
		Warrior a= new Warrior("테스터1");
		//Magician a = new Magician("테스터1");
		//Archer a = new Archer("테스터1);
		
		Warrior b = new Warrior("테스터2");
		//Magician b = new Magician("테스터2");
		//Archer a = new Archer("테스터2);
		
		//힌트~ 추상적 개념/ 대략적인 추상적인걸로..?
		//대충 표현..? 다형성~!!! 
		//
		
		interaction.battle(a, b);
	}
}
