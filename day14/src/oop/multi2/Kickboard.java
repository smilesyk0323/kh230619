package oop.multi2;

public class Kickboard implements Electronic, Transportation{

	@Override
	public void move() {
		System.out.println("전동킥보드가 이동합니다");
	}

	@Override
	public void power() {
		System.out.println("전동킥보드의 전원을 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("전동킥보드의 전원을 끕니다");
		
	}

}
