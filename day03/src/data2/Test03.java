package data2;

public class Test03 {
	public static void main(String[]args) {
		//KH주용소에서는 휘발유를 1L에 1530원에 팔고 있습니다.
		//50000원 주유했을 때 주유되는 휘발유의 양을 출력하세요 
		//int oilPrice = 1530;
		//int oilPay = 50000;
		
		//int oil = oilPay / oilPrice;
		
		//System.out.println(oil); //32
		
		//주유소 풀이
		
		//입력
		int unitPrice = 1530;
		int money = 50000;
		
		//계산
		//int liter = money / unitPrice;
		//double liter = money / unitPrice;
		double liter = (double)money / unitPrice;//float 와 섞지말것 
				
		//출력
		System.out.println(liter);
				
				
	}

}
