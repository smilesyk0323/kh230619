package oop.constructor3;

public class Test01 {
		public static void main(String[]args) {
			Character a = new Character("헤라클레스","전사",50);
			Character b = new Character("포세이돈","마법사");
			Character c = new Character("아프로디테","마법사",1);
			
			a.show();
			b.show();
			c.show();
		}

}
