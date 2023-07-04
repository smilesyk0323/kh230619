package oop.keyword4;

import java.util.Random;

public class Robot {
	//[1]제곱계산기능
	//public static 반환형 이름(매개변수){ 코드}
	public static int square(int left) {
		return left *left;
	}
	public static double square(double left) {
		return left *left;
	}
	//[2] 삼각형 넓이 구하는 메소드 
	public static double triangle(int width, int high ) {
		return (width * high) /2d;
	}
	//[3]원의 넓이를 구하는 메소드(넓이 = 반지름 * 반지름 * 원주율)
	public static float circle(int radius ) {
		//return  radius*radius * 3.14;
		//return Robot.square(radius)*3.14;
		return square(radius)*3.14f;
	}
	public static double circle(double radius) {
		return square(radius)*3.14;
	}
	//[4]배열을 선택정렬하는 메소드 
	public static void sort(int[] data) {
		 
	}
	
	//[5]배열을 뒤집는 메소드(reverse)
	public static void reverse(int[]data) {
		for(int i =0; i < data.length/2; i++) {
			int left = i;//왼쪽위치 
			int right = data.length -1 -left;//오른쪽 위치 
			
			int backup = data[left];
			data[left] = data[right];
			data[right] = backup;
		}
	}
	//[6]배열을 무작위로 섞는 메소드(shuffle)
	public static void shuffle(int[]data) {
		Random r = new Random();
		for(int i = 0; i< data.length; i++) {
	
			int index = r.nextInt(data.length);

			
			if(i==index) {
				i--;
				continue;
			}
			int backup = data[i];
			data[i] = data[index];
			data[index] = backup;
		
		}
	}
	//[7]배열을 출력하는 메소드 
	public static void show(int[]data) {
		
	
	}
	
	
	
	
	
	
}
