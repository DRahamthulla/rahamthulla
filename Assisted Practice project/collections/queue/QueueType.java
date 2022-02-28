package queue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueType {

	public static void main(String[] args) {
	 PriorityQueue<Integer> q1=new PriorityQueue<Integer>();
	  q1.add(3);
	  q1.add(4);
	  q1.add(5);
	  q1.add(6);
	  q1.add(7);
	
	   System.out.println(q1.poll());
	   System.out.println(q1.peek());
	   System.out.println(q1);
	   Iterator<Integer> value =q1.iterator(); 
	   while(value.hasNext());{
		   System.out.print(value.next());
	   }
	}
}
	   

		

