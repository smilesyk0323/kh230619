package api.lang.string3;

public class Test02_2 {
	public static void main(String[]args) {
		//문자열 덧셈 성능 측정 (StringBuilder)
		//- 싱글 스레드 환경에서는 StringBuilder가 효율적(잠금장치가 없으니깐,확신이 있다면!!!)
		//- 멀티 스레드 환경에서는 StringBuffer가 효율적(느리지만 안전하다/순서가 필요하다, 잘모르겠다면 사용)
		
		long start = System.currentTimeMillis();//측정시작
		
		
		StringBuilder buffer = new StringBuilder();
		for(int i = 0; i < 10000 ; i++) {
			buffer.append("*");
		}
		String star = buffer.toString();
		
		long finish = System.currentTimeMillis();//측정완료
		
		long time = finish - start;
		System.out.println("time = " + time);
	}
}
