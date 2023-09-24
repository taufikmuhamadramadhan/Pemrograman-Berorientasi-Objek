package kasus2_Restorant2;

import java.util.Scanner;

public class RestoranMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte nomor = 0;
        int jumlah = 0;
        char pesanUlang = 'y';
        
        Scanner input = new Scanner(System.in);
        Penjualan menu = new Penjualan();
        
        menu.tambahMenuMakanan("Mie Ayam", 10000, 10);
        menu.tambahMenuMakanan("Mie Ayam Baso", 15000, 20);
        menu.tambahMenuMakanan("Mie Ayam Baso Tulang", 22000, 10);
        menu.tambahMenuMakanan("Mie Baso", 12000, 25);
        menu.tambahMenuMakanan("Mie Baso Urat", 25000, 15);
        menu.tambahMenuMakanan("Mie Baso Urat Pleton", 35000, 20);
        menu.tambahMenuMakanan("Mie Yamin", 500, 20);
        menu.tambahMenuMakanan("Mie Yamin Ayam Baso", 33000, 15);
        menu.tambahMenuMakanan("Krupuk", 2000, 40);
        System.out.println("Menu Makanan yang tersedia");
        menu.tampilMenuMakanan();

        do {
	        System.out.print("masukan nomor makanan yang ingin dipesan : ");
	        nomor = input.nextByte();
	        System.out.print("masukan jumlah yang ingin di pesan : " );
	        jumlah = input.nextInt();
	        menu.pesan(nomor, jumlah);
	        System.out.println("pesan lagi ? (y/t)");
	        pesanUlang = input.next().charAt(0);
        
        } while (pesanUlang == 'y');
        input.close();
        System.out.println("Terima kasih telah membeli makanan kami");
	}

}
