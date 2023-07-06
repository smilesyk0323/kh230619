package oop.poly1;

public class MacBook extends Notebook{

	@Override
	public void power() {
		System.out.println("맥북의 전원을 켭니다");	
	}

	@Override
	public void video() {
		System.out.println("맥북의 동영상을 재생합니다");
	}

	@Override
	public void typing() {
		System.out.println("맥북의 타이핑 기능을 실행합니다");
		
	}

}
