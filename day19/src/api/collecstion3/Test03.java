package api.collecstion3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test03 {
	public static void main(String[] args) {
		//day19과제풀이 
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> call = new TreeMap<>();
		
					
		while(true) {
		
			String name = sc.next();
			if(name.matches("종료")) {
				break;
			}
			else {			
				if(call.containsKey(name)) {
					int count = call.get(name);
					call.put(name, count+1);
					System.out.println(name+"현재"+ (count +1)+"표 획득!");
				}
				else {
					call.put(name,1);
					System.out.println(name+"현재1표획득!");
				}				
			}			
		}	
		sc.close();
		System.out.println(call);		
	}
}
