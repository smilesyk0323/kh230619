package day18;

public class Data15 {
	public static void main(String[] args) {
		int price = 100000;
		int eventP = price*75/100;
		
		int people = 3; 
		int day = 7;
		
		int dayPrice = day * eventP;
		int total = people	* dayPrice;
		System.out.println(total);
	}

}
