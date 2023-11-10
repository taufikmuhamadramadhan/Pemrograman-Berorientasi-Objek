package hashSet;

import java.util.HashSet;
import java.util.Iterator;
public class Exersice3 {
	public static void main(String[] args) {
	       // Create a empty hash set
	   HashSet<String> h_set = new HashSet<String>();
	 // use add() method to add values in the hash set
	       h_set.add("Merah");
	       h_set.add("Hijau");
	       h_set.add("Hitam");
	       h_set.add("Putih");
	       h_set.add("Pink");
	  System.out.println("isi Hash Set: " + h_set);
	  System.out.println("Size of the Hash Set: " + h_set.size());
	 }
}