import java.util.LinkedList;
import java.util.Queue;


public class QueueExample {
	
	public static void main(String[] args) {
		Queue<String> queue  = new LinkedList<String>();
		queue.add("Connection1");
		queue.add("Connection2");
		queue.add("Connection3");
		queue.add("Connection4");
		queue.add("Connection5");
		
		System.out.println("Queue before poll elements: " + queue);
		// Retrieval from queue is done by three methods.
		//1. element() - retrieves the head of the queue without removal from queue and throws exception - NosuchElementException if empty
		//2. peek() - retrieves the head of the queue without removal from queue and returns null if empty
		//3. poll() - retrieves the head of the queue with removal 
		String connection = queue.poll();
		System.out.println("Got the connection: " + connection);
		
		System.out.println("Queue After poll elements: " + queue);
	}

}
