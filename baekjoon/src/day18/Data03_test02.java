package day18;

public class Data03_test02 {
	public static void main(String[] args) {
		
		int birth = 2003; 
		
		int year = 2023;
		
		int pass = (year - birth )+ 1;
		
		if(pass>=20) {
			System.out.println("가능");
		}
		else {
			System.out.println("불가능");
		}
		
	}

}
