package Case3_Berhitung;

import java.util.Scanner;

public class SimpleKalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		String text = input.nextLine();
		input.close();
		
		String[] fullInput = text.split(" ");
		
		int num1 = Integer.parseInt(fullInput[0]);
		int num2 = Integer.parseInt(fullInput[2]);
		int hasil = 0; 
		
		if(num1 >= 1 && num2 <1000 ) {
			switch(fullInput[1]) {
				case "*":
					hasil = num1 * num2;
					break;
				case "/":
					hasil = num1 / num2;
					break;
				case "+":
					hasil = num1 + num2;
					break;
				case "-":
					hasil = num1 - num2;
					break;
				case "%":
					hasil = num1 % num2;
					break;
				default:
					System.out.println("salah operator");
					break;
			}
		System.out.println(hasil);
		}else {
			System.out.println("invalid input");
		}
		
	}

}
