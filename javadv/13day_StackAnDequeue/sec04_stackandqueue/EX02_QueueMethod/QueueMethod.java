package sec04_stackandqueue.EX02_QueueMethod;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
	public static void main(String[] args) {
		// 1. 예외처리기능 미포함 메서드 첫번째 세트
		Queue<Integer> queue1 = new LinkedList<Integer>();
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		System.out.println(queue1.element()); // 3
		System.out.println(queue1.remove()); // 3
		System.out.println(queue1.remove()); // 4
		System.out.println(queue1.remove()); // 5
		// System.out.println(queue1.remove()); //NoSuchElementException
		System.out.println();
		
		// 2. 예외처리기능 포함 메서드 두번째 세트
		Queue<Integer> queue2 = new LinkedList<Integer>();
		System.out.println(queue1.peek()); // 가장 앞에 있는 데이터를 확인하는 연산
		
		//@2-1. offer(E item)
		queue2.offer(3); // 큐 맨 뒤에 값 삽입
		queue2.offer(4); // 값 추가 성공 시 true 반환
		queue2.offer(5); // 값 추가 실패 시 false 반환
		
		//@2-2. E peek();
		System.out.println(queue2.peek()); //3
		
		//@2-3. E poll(); : 큐 맨 앞에 있는 값 반환 후 삭제, 쿠가 비어있을 경우 null 반환
		System.out.println(queue2.poll()); //3
		System.out.println(queue2.poll()); //4
		System.out.println(queue2.poll()); //5	
		System.out.println(queue2.poll()); //null 
	}
}
