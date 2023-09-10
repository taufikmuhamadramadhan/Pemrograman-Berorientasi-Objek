package Case6_BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nomor 1 : ");
		BigInteger num1 = input.nextBigInteger();
		System.out.print("Masukkan angka 2 : ");
		BigInteger num2 = input.nextBigInteger();
		
		input.close();
		
		BigInteger hasilJumlah = num1.add(num2);
		BigInteger hasilKali = num1.multiply(num2);
		
		System.out.println(hasilJumlah);
		System.out.println(hasilKali);
	}

}
