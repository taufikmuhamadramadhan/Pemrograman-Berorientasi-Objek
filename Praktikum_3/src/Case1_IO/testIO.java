package Case1_IO;

import java.util.Scanner;

public class testIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        
        String[] test = str.split("[ !,?._'@]+");
        
        System.out.println(test.length);
        
        for(String a : test) {
        	System.out.println(a);
        }
        
	}

}
