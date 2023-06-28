package baekjoon;

import java.util.Scanner;

public class Test01 {
    public static void main(String[]args){

    	Scanner sc = new Scanner(System.in);
    	 int H = sc.nextInt();
    	 int M = sc.nextInt();

    	 sc.close();
    	 
    	 int total;
    	 
    	 if(H>0) {
    		 total = H * 60 + M;
    		 System.out.println(total);
    	 }
    	 else {
    		 total = M;
    		 System.out.println(total);
    		 if(total<60) {
    			 
    		 }
    	 }
    	  
    	 
    	 //int RT = total - 45;
         
    	
    	//System.out.println(RT/60);
    	//System.out.println(RT%60);
    	
    }
}