package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exersice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> list_Hewan = new ArrayList<String>();
		  list_Hewan.add("Kucing");
		  list_Hewan.add("Anjing");
		  list_Hewan.add("Monyet");
		  list_Hewan.add("Babi");
		  list_Hewan.add("Ayam");
		  // Print the list
		  for (String element : list_Hewan) {
		    System.out.println(element);
		    }
	}

}
