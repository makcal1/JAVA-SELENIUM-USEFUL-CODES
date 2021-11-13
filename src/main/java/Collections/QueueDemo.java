package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {


		PriorityQueue queue = new PriorityQueue();
		//Adding elements add() offer()
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.offer("C");
		//queue.offer(100); // not allowed in queue ( heterogenios data not allowed)

		System.out.println(queue);//[A, B, C, C] insertion order preserved && duplicates allowed

		// get head element element() peek()
		//	System.out.println(queue.element()); // A --> Return Head Element , if empty returns NoSuchElementException
		//	System.out.println(queue.peek()); 	 // A  --> Return Head Element , if empty returns null

		// RETURN & REMOVE Element from queue remove() poll()

		//	System.out.println(queue.remove());  //A --> Remove header element , if empty returns exception
		//	System.out.println(queue.poll());    //A --> Remove header element , if empty returns null
		//	System.out.println(queue);
		//	
		Iterator iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
