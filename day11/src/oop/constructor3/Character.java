package oop.constructor3;

public class Character {
	//멤버 필드 
	String name, job;
	int level;
	
	//멤버 메소드
	void setName(String name) {
		this.name = name;
	}
	void setJob(String job) {
		switch(job){
		case "전사":
		case "마법사":
		case "궁수":
			this.job = job;
		}
	}
	void setLevel(int level) {
		if( level <1) return;
		this.level = level;
	}
	
	
	String getName() {
		return this.name;
	}
	String getJob() {
		return this.job;
	}
	int getLevel() {
		return this.level;
	}

	//생성자 - 생성시 필요한 데이터를 강제하는 도구
	Character(String name, String job){
		this(name,job,1);
	}
	Character(String name, String job, int level){
		this.setName(name);
		this.setJob(job);
		this.setLevel(level);
	}
	
	void show() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디: "+this.name);
		System.out.println("직업: "+ this.job);
		System.out.println("레벨: "+this.level);
	}
	

}
