package day18;

public class Data13 {
	public static void main(String[] args) {
		int people = 27 + 1;
		int price = 2500;
		int event = 5; //5+1로 풀이 
		
	 int free = people / (event+1);	
	 int pay = 	people - free;
	 
	 int total = price * pay;
	}

}
