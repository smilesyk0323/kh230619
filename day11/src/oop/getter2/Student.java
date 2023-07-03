package oop.getter2;

public class Student {
	//멤버 필드
	String name;
	int grade;
	int korean, english, math;
	
	//멤버 메소드 
	void setName(String name) {
		this.name = name;
	}
	void setGrade(int grade) {
		if(grade >=1 && grade <=6) {
		this.grade = grade;
		}
	}
	void setKorean(int korean) {
		if(korean<0 || korean>100) {
			return;
		}		
		this.korean = korean;
	}
	void setEnglish(int english) {
		if(english<0 || english>100) 	return;	//조건에 대한 명령이 하나뿐이라면 중괄호 생략! 
		this.english = english;
	}
	void setMath(int math) {
		if(!(math>=0 && math<=100)) return;
		this.math = math;
	}
	
	String getName() {
		return this.name;
	}
	int getGrade() {
		return this.grade;
	}
	int getKorean() {
		return this.korean;
	}
	int getEnglish() {
		return this.english;
	}
	int getMath() {
		return this.math;
	}
	
	int getTotal() {
		//return this.korean + this.english + this.math;
		return this.getKorean() + this.getEnglish() + this.getMath();
	}
	
   double getAverage() {
		return this.getTotal() / 3d;
	}
   String getLevel() {
	   double average = this.getAverage();
	   if(average >= 90) 
		   return "A";
	   else if(average >= 80) 
		   return "B";
	   else if(average >= 70)
		   return "C";
	   else 
		   return "F";   	   
   }
   
   
	void setup(String name, int grade, int korean, int english, int math) {
		this.setName(name);
		this.setGrade(grade);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	
	void show() {
		System.out.println("<학생성적정보>");
		System.out.println("이름: "+this.name+"\t"+this.grade+"학년");
		System.out.println("총점: "+ this.getTotal()+"점");
		System.out.println("평균점수: "+this.getAverage()+"점");
		System.out.println("등급: "+ this.getLevel());
	}
}
