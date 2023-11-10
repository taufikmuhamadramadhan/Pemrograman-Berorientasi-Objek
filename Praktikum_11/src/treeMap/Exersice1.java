package treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Exersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create a tree map
		   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
		  // Put elements to the map 
		  tree_map.put(1, "Merah");
		  tree_map.put(2, "Hijau");
		  tree_map.put(3, "Hitam");
		  tree_map.put(4, "Putih");
		  tree_map.put(5, "Biru");
		    
		   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
		   {
		    System.out.println(entry.getKey() + "=>" + entry.getValue());
		   }
	}

}
