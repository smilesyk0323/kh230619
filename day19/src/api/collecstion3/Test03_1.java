package api.collecstion3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		//투표함 만들기
		Map<String, Integer> vote = new HashMap<>();

		//샘플 데이터 추가
		Scanner sc = new Scanner(System.in);

		while(true) {
			//사용자 투표한 내용을 투표함에 반영
			System.out.println("당신의 아이돌에게 투표하세요!");
			String name = sc.nextLine();

			if(name.equals("종료")) {
				break;
			}

			name = name.replace(" ", "").toLowerCase();

			Integer count = vote.get(name);//이름에 대한 득표수 추출
			if(count == null) {//득표수가 null이라면(이름이 없다면)
				vote.put(name, 1);//득표수 1로 등록
			}
			else {//아니면
				vote.put(name, count+1);//득표수 1증가 처리
			}

			//출력
			//System.out.println(vote);
			System.out.println("["+name+"] 현재 득표수 " + vote.get(name));
		}

		sc.close();

		//결과 출력
		System.out.println(vote);

	}
}
