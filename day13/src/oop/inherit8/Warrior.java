package oop.inherit8;

public class Warrior extends Character{

	public Warrior(String id) {//생성자를 맞춰라
		super(id);
	}

	@Override
	public void attack() {
		System.out.println("전사가 칼로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("전사가 뛰어서 이동합니다!");
	}

	@Override
	public void store() {
		System.out.println("전사가 상점을 개설합니다!");
	}
	
	

}
