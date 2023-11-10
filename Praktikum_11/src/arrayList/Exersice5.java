package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exersice5 {
	  public static void main(String[] args) {
		  
		  List<String> list_Hewan = new ArrayList<String>();
		  list_Hewan.add("Kucing");
		  list_Hewan.add("Anjing");
		  list_Hewan.add("Monyet");
		  list_Hewan.add("Babi");
		  list_Hewan.add("Ayam");
		  // Print the list
		  System.out.println(list_Hewan);
		  // Update the third element with "Yellow"
		  list_Hewan.set(2, "Merpati");
		   // Print the list again
		  System.out.println(list_Hewan);
		 }
}
