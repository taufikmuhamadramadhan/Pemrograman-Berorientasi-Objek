package case5_String;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan kata 1 : ");
		String text1 = input.next();
		System.out.print("Masukkan kata 2 : ");
		String text2 = input.next();
		
		int sumText = text1.length() + text2.length();
		int compareText = text1.compareToIgnoreCase(text2);
		
		String capitalText1 = text1.substring(0,1).toUpperCase()+text1.substring(1);
		String capitalText2 = text2.substring(0,1).toUpperCase()+text2.substring(1);
		String fuseAllText = capitalText1 + " " + capitalText2;
		System.out.println(sumText);
		
		if (compareText < 0) {
            System.out.println("No");
        } else if (compareText > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("Equal");
        }
		
		
		System.out.println(fuseAllText);
		
		
	}

}
