package priorityQueue;

import java.util.PriorityQueue;

public class Exersice4 {
	public static void main(String[] args) {
	
	 // Create Priority Queue
	  PriorityQueue<String> pq1 = new PriorityQueue<String>();  
	 // use add() method to add values in the Priority Queue
	  pq1.add("Merah");
	  pq1.add("Hijau");
	  pq1.add("Hitam");
	  pq1.add("Putih");
	  System.out.println("Original Priority Queue: "+pq1);
	 
	 // Inserts the specified element into this priority queue.
	  pq1.offer("Biru");
	
	  System.out.println("New Priority Queue: " + pq1);
	} 
}