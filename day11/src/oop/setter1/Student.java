package oop.setter1;

public class Student {
	//필드가 만들어져야 클래스의 나머지 형태를 구성할 수 있다
	String name;
	int score;
	
	//메소드 - setup, show
	void setup(String name, int score) {
		this.setName(name);//내가 가진 setName 메소드에 name을 전달하며 호출
		this.setScore(score);//내가 가진 setScore 메소드에 score를 전달하며 호출 
	}

	void show() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
	//필드를 하나씩 변경할 수 있는 메소드를 구현 
	//-> setter 메소드 >>>필드의 갯수 만큼 만들어야 함. (지금은 수동->나중엔 자동)
	//- set + 필드명으로 이름 짓는다
	//- 설정 외에 다른 작업을 하지 않는다
	//- (중요) 올바른 데이터만 설정 가능하도록 필터링 처리를 한다
	void setName(String name) {
		switch(name) {//문자열은 비교를 switch로 한다 (if로 하는 방법은 나중에)
		case"피카츄"://switch는 정수와 문자열 가능 
		case"라이츄":
			this.name = name;
		}
	}
	
	void setScore(int score) {
		if(score >=0 && score <= 100) {
			
			this.score = score;
		}
	}
}





