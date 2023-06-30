package oop.method2;

public class Player2 {
	String name;
	String game;
	String season;
	int gold;
	int silver;
	int bronze;
	
	void show1() {
		System.out.print("이름: "+ this.name+"\t");
		System.out.print("종목: "+ this.game+"\t"	);
		System.out.print("구분: "+ this.season+"\t");
		System.out.print("금메달:"+ this.gold+"\t");
		System.out.print("은메달: "+ this.silver+"\t");
		System.out.println("동메달: "+ this.bronze);
	}	
		
	void setup1(String name,String game, String season,int gold, int silver,int bronze){
		
		this.name = name;
		this.game = game;
		this.season = season;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
		
	}
}
