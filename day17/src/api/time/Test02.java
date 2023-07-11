package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	 public static void main(String[]args) {
		 // 시간 정보를 현재 시간으로 구하여 출력 
		 // - 2023년 7월 11일
		 // - 오후 1시 1분
		 // - 13:00:05
		 //-2023-07-11 화 13:01:05
		 
		  //시간 객체
		 Date a = new Date();//현재시간 얻어오는 것만 허용 
		 
		 //형식 객체 
		 SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일");
		 SimpleDateFormat fmt2 = new SimpleDateFormat("a h시 m분");
		 // 12시간 방식 최소 1, 최대 12-->h// 24시간 방식 최소 0 , 최대 23--->H
		 SimpleDateFormat fmt3 = new SimpleDateFormat("H:mm:ss");//시간은 한자리 분, 초는 두자리로 
		 SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss");
		
		//출력 		

		System.out.println(fmt.format(a));
		System.out.println(fmt2.format(a));
		System.out.println(fmt3.format(a));
		System.out.println(fmt4.format(a));
		
		 
		 
	 }

}
