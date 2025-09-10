package Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityq {
     public static void main(String[] args) {
	     Queue<Integer> pq=new PriorityQueue<>();
	     //by default min-heap
	     pq.add(12);
	     pq.add(3);
	     pq.add(17);
	     pq.add(1);
	     
	     for(Integer q:pq) {
	    	 System.out.print(q+ " ");
	     }
	     System.out.println();
	     Queue<Integer> pqr=new PriorityQueue<>(Collections.reverseOrder());
	     pqr.add(12);
	     pqr.add(3);
	     pqr.add(17);
	     pqr.add(1);
	     
	     for(Integer q:pqr) {
	    	 System.out.print(q+ " ");
	     }

	     pqr.poll();
	     System.out.println(pqr);
	     
	     Que:kth largest or kth smallest element:
	}
}
