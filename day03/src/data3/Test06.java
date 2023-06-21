package data3;

public class Test06 {
	public static void main(String[]args) {
		//어떤 두 자리 이하의 수(ea : 95)가 주어졌을때 이 숫자에 3, 6, 9가 포함되어 있는지 판정 후 출력하세요 
		//369 게임에서 박수치는 숫자인지 아닌지 판정)
		//int number = 95;
		
		//boolean single = number>0 && number <10;  <<제시 숫자가 두자리란 조건 필요없음
		//boolean number2 = single == 3 || single == 6 || single == 9;
		//boolean tenN = number >=10 / 10;
		//boolean number3 = tenN == 3 || tenN  == 6 || tenN == 9; 
						
		//boolean clap = number2 || number3
		
		//System.out.println(clap);... 오류로 출력 불가.. << 일의자리와 십의 자리를 구분을 제일 먼저
		
		//369판정 
		//입력
		int number = 95;
		
		//계산
		
		int ten = number / 10;
		int one = number % 10;
		
		//boolean clap = tenClap || oneClap; 십의자리에 3,6,9 또는 일의자리의3,6,9;
		
		boolean tenClap = ten ==3 || ten == 6 || ten == 9;
		boolean oneClap = ten ==3 || ten == 6 || ten == 9;
		boolean clap = tenClap || oneClap;
		
				
		//출력
		System.out.println(clap);

		
	}
}
