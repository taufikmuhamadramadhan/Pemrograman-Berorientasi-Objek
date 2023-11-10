package treeMap;

import java.util.TreeMap;

public class Exersice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a tree map
		   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		  
		  // Put elements to the map 
		  tree_map1.put("C1", "Merah");
		  tree_map1.put("C2", "Hijau");
		  tree_map1.put("C3", "Hitam");
		  tree_map1.put("C4", "Putih"); 
		    
		  System.out.println(tree_map1);
		        if(tree_map1.containsKey("C1")){
		            System.out.println("The Tree Map contains key C1");
		        } else {
		            System.out.println("The Tree Map does not contain key C1");
		        }
		        if(tree_map1.containsKey("C5")){
		            System.out.println("The Tree Map contains key C5");
		        } else {
		            System.out.println("The TreeMap does not contain key C5");
		        }
		}
	}


