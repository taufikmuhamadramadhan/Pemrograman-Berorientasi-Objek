package Case5_BukaTutupJalan;

import java.util.Scanner;

public class BukaTutupJalan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String gabungPlat = "";
		
		System.out.print("Masukkan plat nomor mobilnya : ");
		String platNomor = input.nextLine();
		
		input.close();		

		gabungPlat = platNomor.replaceAll("[^0-9]", "");
		long angka = Long.parseLong(gabungPlat);		
				
		long hasilKurang  = angka - 999999;		
		int sisaBagi = (int) (hasilKurang % 5);
			
		if(sisaBagi == 0) {
			System.out.println("Jalan");
		}else {
			System.out.println("Berhenti");
		}
	}

}
