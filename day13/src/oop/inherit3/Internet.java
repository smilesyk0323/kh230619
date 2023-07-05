package oop.inherit3;

//상위 클래스 
public class Internet {
	//필드 
	public String url;
	
	//세터.게터 메소드
	public String getUrl() {
		return url;
	}
	public void setUrl(String address) {
		this.url = address;
	}
	
	//공통메소드
	public void refresh() {
		System.out.println("새로고침 기능 실행");
	}
	public void move() {
		System.out.println("페이지 이동기능 실행");
	}
	
	
}
