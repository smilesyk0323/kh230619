package api.collection4;

import java.util.LinkedList;
import java.util.Queue;

public class Test02 {
public static void main(String[] args) {
	 //큐(Queue)
	//= 대기열을 구현할 때 사용하는 저장소 
	
	//List<String>list = new LinkedList<>();
	Queue<String>queue = new LinkedList<>();
	
	
	//추가 - offer()
	queue.offer("홍길동");
	queue.offer("임꺽정");
	queue.offer("허준");
	queue.offer("장보고");
	
	//확인
	System.out.println(queue.peek());//홍길동
	
	queue.poll();//내보내라
	System.out.println(queue.peek());//임꺽정
	
	queue.poll();//내보내라
	System.out.println(queue.peek());//허준
	
	queue.poll();//내보내라
	System.out.println(queue.peek());//장보고
	
	queue.poll();//내보내라
	System.out.println(queue.peek());//null
	
}
}
