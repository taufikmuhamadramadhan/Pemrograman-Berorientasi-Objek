package Case2_IO2;

import java.util.Scanner;

public class justifyText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		String text = input.nextLine();
		input.close();
		
		String[] fullInput = text.split(" ");
		
		text = fullInput[0];
		int num = Integer.parseInt(fullInput[1]);
		
		System.out.println("========================");
		if(text.length() < 10 && (num >= 0 && num <= 999) ) {
			String paddedNumber = String.format("%03d", num);
            System.out.printf("%-15s %s%n", text, paddedNumber);
		}else {
			System.out.println("Error input invalid");
		}
		System.out.println("========================");
	}

}
