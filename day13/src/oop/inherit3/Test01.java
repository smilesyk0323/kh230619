package oop.inherit3;

public class Test01 {
	public void main(String[]args) {
		//Internet은 생성하면 안된다 ->상속의 의미가 없어짐 
		
		Chrome a = new Chrome();
		a.setUrl("https://www.google.com");
		a.refresh();
		a.move();
		a.develop();
		a.chromeStroe();
		
		Edge b = new Edge();
		b.setUrl("https://www.google.com");
		b.refresh();
		b.move();
		b.fullScreen();
		
		Whale c = new Whale();
		c.setUrl("https://www.google.com");
		c.refresh();
		c.move();
		c.papago();
		c.naverSearch();
		
	}

}
