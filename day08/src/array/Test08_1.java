package array;

import java.util.Scanner;

public class Test08_1 {
	public static void main(String[]args) {
		//배열에 5개의 점수 데이터를 입력 
		
		//int[] scoreList = new int[5];//이름을 단수로 만들지 않음 
	    int[] scoreList = new int[5];
	    
	    Scanner sc = new Scanner(System.in);
	    
	    for(int i =0; i < scoreList.length; i++) {
	    	System.out.print("점수 : ");
	    	scoreList[i] = sc.nextInt();
	    }
	    
	    sc.close();
	    
	    System.out.println("재평가자 점수는 다음과 같습니다");
	    for(int i=0; i< scoreList.length; i++) {
	    	if(scoreList[i]<60) {
	    		System.out.println("재평가자 점수 = "+scoreList[i]);
	    	}
	    }
	    System.out.println(" 성적우수자 점수는 다음과 같습니다");
	    for(int i=0; i< scoreList.length; i++) {
	    	if(scoreList[i]>=90) {
	    		System.out.println("성적우수자 점수 = "+scoreList[i]);
	    	}
	    }
	    //둥수 확인은 count!! 나보다 위에 몇명이 있는지!! 
	    
	    int score = 75;
	    int count = 0;//int rank = 1; 
	    for(int i =0; i<scoreList.length; i++) {
	    	if(scoreList[i] > score) {
	    		count++;//rank++;
	    	}
	    }
	    System.out.println("count"+ count);
	    
	    int rank = count +1;
	    System.out.println("예상 등수 = "+rank);// 바로 등수가 나옴! 
	}

}
