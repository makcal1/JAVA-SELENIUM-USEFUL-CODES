package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo_02 {

	public static void main(String[] args) {
		LinkedList queue = new LinkedList ();
		//Adding elements add() offer()
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.offer("C");
		queue.offer(100); //  allowed in queue ( heterogenios data allowed)
		
		
		System.out.println(queue); //[A, B, C, C, 100]


	}

}
