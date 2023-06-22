package input;

public class Test04 {
	public static void main(String[]args) {
		//강의장 입실시간과 퇴실시각을 입력받아 실제 수업에 참여한 시간을 계산하여 출력
		//입실시각 입력 : 0925
		//퇴식시각 입력 : 1830
		//수업에 참여한 시간은 9시간 5분 입니다
		
		
		//int sT = 925;
	    //int eT = 1830;
		
		//int sH = sT / 100;
		//int sM = sT %100;
		
		//System.out.println(sH);
		//System.out.println(sM);
		
		//int eH = eT / 100;
		//int eM = eT % 100;
		
		//풀이 
		
		//입력
		int enter = 925;
		int leave = 1830;
		
		
		//계산
		int enterHour = enter / 100;
		int enterMin = enter % 100;
		//System.out.println("enterHour =" + enterHour);
		//System.out.println("enterMIn =" + enterMin);
		
		int leaveHour = leave / 100;
		int leaveMin = leave % 100;
		
		int enterTime = enterHour * 60 + enterMin;
		int leaveTime = leaveHour * 60 + leaveMin;
		
		int time = leaveTime - enterTime;
		//System.out.println("time = " + time);
		
		int hour = time / 60;
		int minute = time % 60;
		
		//출력
		//System.out.println("참여 시간은 " + hour + " 시간 " + minute + "분 입니다");
		System.out.print("참여 시간은 ");
		System.out.print(hour);
		System.out.print(" 시간 ");
		System.out.print(minute);
		System.out.print(" 분 입니다");
		System.out.println();
		
		

		
		
				

		
		
		
				
				
	}

}
