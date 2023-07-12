package day18;

public class Data11 {
	public static void main(String[] args) {
		int startH = 9;     int startM = 40;
		int endH = 12;     int endM = 50;
		
		int totalStartM = (startH * 60) + startM;
		int totalEndM = (endH * 60)	+ endM;
		
		int useTime =  totalEndM - totalStartM;
		
		int pay  = 1200/60;
		int timePay = useTime*pay;
		
		System.out.println("총이용시간은 "+ useTime/60+"시"	+ useTime%60+ "분");
		System.out.println("이용요금은 "+ timePay+"원");
	}

}
