package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
  public static void main(String[] args) {
	 Queue<Integer> q=new PriorityQueue<>();
	 
//	 Interface->classes
//	 Queue->PriorityQueue, ArrayDeque, LinkedList, ArrayDeque
	 
//	 Operation:q.add(), q.offer()
//	           q.remove(), q.poll()   
//	            q.peek()	 
	 q.add(1);
	 q.add(2);
	 q.add(5);
     q.add(9);
     q.offer(4);
     
     System.out.println(q.peek());
     System.out.println(q.poll());
     System.out.println(q.remove(4)); //return true and false
     System.out.println(q);
     
	 
}
}
