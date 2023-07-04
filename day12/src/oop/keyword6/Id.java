package oop.keyword6;

public class Id {
	private final String id; 
	private String password;
	private String name;
	
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
		public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	
	Id(String id, String password, String name){
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
//	public String getPasswordMasking() {
//		return ""+this.password.charAt(0)+this.password.charAt(1) +"**********";
//	}

	public String getPasswordMasking() {
		String total = "";
		for(int i=0; i < this.password.length(); i++) {
			if(i <= 1) {
				total += this.password.charAt(0);
			}
			else {
				total += "*";
			}
		}
		return total;
	}

	public void show() {
		System.out.println("아이디: "+this.id);
		System.out.println("닉네임: "+this.name);
		System.out.println("비밀 번호: "+this.getPasswordMasking());
	}
	
	
}
