package condition3;

public class Test02 {
	public static void main(String[]args) {
		//switch~case 구문(조건문)
		//- if 구문은 "순차적"으로 실행되는 특징이 있다
		//- 이게 문제가 되는 상황이 있다
		
		//입력 - 월 정보
		int month = 2;
		
		switch(month) {//month에 있는 값을 토대로 실행 지점을 찾겠다
		case 12,1,2://17버전 적용가능한 기능이나 대부분 사용 불가일것..
			System.out.println("겨울");
			break;
		case 3://month가 2인 경우 실행할 곳
			System.out.println("겨울");
			break;//그만하고 나가라!
		case 4://month가 3인 경우 실행할 곳 
			System.out.println("봄");
		default : //else	
		}
		
	
	}
}
