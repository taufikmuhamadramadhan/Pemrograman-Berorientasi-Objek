package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Exersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Merah");
		  hash_map.put(2, "Hijau");
		  hash_map.put(3, "Hitam");
		  hash_map.put(4, "Putih");
		  hash_map.put(5, "Biru");
		  for(Map.Entry x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }  
	}

}
