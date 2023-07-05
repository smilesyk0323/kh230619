package oop.inherit8;

//추상클래스가 되면 (1)객체 생성 금지 (2) 추상 메소드 작서 가능 
public abstract class Character {//캐릭터 사용 불가 클래스에 있음
	//공통필드 - 아이디나 레벨 특성상 private가 더 어울림
	private String id;
	private int level;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level < 1) return;
		this.level = level;
	}
	
	//생성자- 오직 아이디만
	public Character(String id) {
		this.setId(id);
		this.setLevel(1);//레벨은 1부터
	}
	
	//공통 메소드 
	public abstract void attack();
	public abstract void move();
	public abstract void store();
		
	public final void show() {
		System.out.println("<캐릭터정보>");
		System.out.println("아이디: "+ this.id);
		System.out.println("레벨: "+ this.level);
	}
	

}
