package api.lang.string2;

import java.util.Scanner;

public class Member {
	private String id;
	private String password;
	private String name;
	private String level; 
	private int point;
	
	Member(){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디입력: ");
		this.id = scanner.nextLine();
		System.out.print("비밀번호입력: ");
		this.password = scanner.nextLine();
		System.out.print("회원이름: ");
		this.name = scanner.nextLine();
		System.out.print("회원레벨: ");
		this.level = scanner.nextLine();
		System.out.print("회원포인트: ");
		this.point = scanner.nextInt();

	}
	
	public String getId() {
		return id;
	}
	String regex = "^[0-9a-z]{8,20}$";
	public void setId(String id) {
		if(id.matches(regex)) {
			this.id = id;
		}		
	}
	
	
	public String getPassword() {
		
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	} 
	


}
