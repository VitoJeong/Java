package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {

	public static void main(String[] args) {

		// 큐(Queue) - 선입선출(FIFO)
		// LinkedList를 통해 인스턴스 생성
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(7);
		queue.offer(5);
		queue.offer(4);
		queue.poll();
		queue.offer(6);
		queue.poll();
		
		System.out.println("peek() : "+queue.peek());
		while (!queue.isEmpty()) {
			System.out.print(queue.poll()+" ");
		}
	}

}
