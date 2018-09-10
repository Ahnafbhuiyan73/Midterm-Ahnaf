package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> newQ = new LinkedList<>();
		newQ.add(269);
		newQ.add(137);
		newQ.add(96);
		newQ.add(2018);
		newQ.add(141);
		System.out.println(newQ.peek());
		System.out.println(newQ.poll());
		System.out.println(newQ.peek());
		System.out.println(newQ.remove());
		System.out.println(newQ.peek());


		System.out.println("Use of for each loop to retrieve data: ");
		for (Integer in : newQ) {
			System.out.println(in);
		}

		System.out.println("Use of while loop to retrieve data: ");
		Iterator itr = newQ.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
	}
}