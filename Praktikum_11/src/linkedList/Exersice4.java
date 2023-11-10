package linkedList;

import java.util.LinkedList;
import java.util.Iterator;

  public class Exersice4 {
	  public static void main(String[] args) {
	    // create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	     	l_list.add("Merah");
	        l_list.add("Hijau");
	        l_list.add("Hitam");
	        l_list.add("Putih");
	        l_list.add("Pink");
	      
	        // print original list
	   System.out.println("Original linked list:" + l_list);  
	 
	    Iterator it = l_list.descendingIterator();
	
	     // Print list elements in reverse order
	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
	  }
}