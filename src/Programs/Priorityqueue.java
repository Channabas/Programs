package Programs;

import java.util.PriorityQueue;

public class Priorityqueue {
	public static void main(String[] args) {
		PriorityQueue<Integer>q=new PriorityQueue<>();
		q.add(5);
		q.add(13);
		q.add(7);
		q.add(125);
		q.add(115);
		q.add(209);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		
		
	}

}
