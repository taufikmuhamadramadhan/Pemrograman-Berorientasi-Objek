package Case4_GajiAgent;

import java.util.Scanner;

public class GajiAgent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		final int gajiPokok = 500000;
		final int hargaBarang = 50000;
		
		int gajiTotal = 0;
		int bonusTarget = 0;
		int denda = 0;
		
		System.out.print("Masukkan jumlah penjualan : ");
		int penjualan = input.nextInt();
		input.close();
		
		int bonusPenjualan = penjualan * hargaBarang * 10/100;
		
		if(penjualan > 80) 
		{
			bonusTarget = bonusPenjualan * 35/100;
			gajiTotal = gajiPokok + bonusTarget + bonusPenjualan ;
		}else if(penjualan >= 40) 
		{
			bonusTarget = bonusPenjualan * 25/100;
			gajiTotal = gajiPokok + bonusTarget + bonusPenjualan ;
		}else if(penjualan >= 15) 
		{
			gajiTotal = gajiPokok +  bonusPenjualan;
		}else 
		{
			denda = (15 - penjualan) * (hargaBarang * 15/100);
			gajiTotal = gajiPokok - denda ;
		}
		
		System.out.println(gajiTotal);
	}

}
