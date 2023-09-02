package case1_Datatype;


import java.util.Scanner;

public class TestDataType {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			String ulang = "y";
			
			do {
				System.out.print("Masukkan data yang akan di test : ");
				
				
				try{
					long test = input.nextLong();
					System.out.println(test +"can be fitted : ");
					if(test >= Byte.MIN_VALUE && test <= Byte.MAX_VALUE) {
						System.out.println("*Byte");
					} 
					if(test >= Short.MIN_VALUE && test <= Short.MAX_VALUE) {
						System.out.println("*Short");
					}
					if (test >= Integer.MIN_VALUE && test <= Integer.MAX_VALUE) {
						System.out.println("*Integer");
					}
					if (test >= Long.MIN_VALUE && test <= Long.MAX_VALUE) {
						System.out.println("*Long");
					}
					System.out.print("Ulang (y/t) ? ");
					ulang = input.next();
				}catch (Exception e) {
					System.out.println( "can't be fit anywhare");
					break;
				}
				
				
				
				
			}while(ulang.equals("y"));
		}
	}

}
