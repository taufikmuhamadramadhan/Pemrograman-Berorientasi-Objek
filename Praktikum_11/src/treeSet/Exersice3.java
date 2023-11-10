package treeSet;

import java.util.TreeSet;
	public class Exersice3 {
	  public static void main(String[] args) {
		  TreeSet<String> tree_set1 = new TreeSet<String>();
		  tree_set1.add("Merah");
		  tree_set1.add("Hujau");
		  tree_set1.add("Oren");
		  System.out.println("Tree set1: "+tree_set1);
		  TreeSet<String> tree_set2 = new TreeSet<String>();
		  tree_set2.add("Pink");
		  tree_set2.add("Putih");
		  tree_set2.add("Hitam");
		  System.out.println("Tree set2: "+tree_set2);
		   // adding treetwo to treeone
		  tree_set1.addAll(tree_set2);
		  System.out.println("Tree set1: "+tree_set1);
	 }
}
