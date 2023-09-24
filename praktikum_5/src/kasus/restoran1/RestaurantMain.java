package kasus.restoran1;

import java.util.logging.*;

public class RestaurantMain {
    private static final Logger logger = Logger.getLogger(RestaurantMain.class.getName());

    public static void main(String[] args) {
        byte nomor = 3;
        int jumlah = 10;
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Mie Ayam", 10000, 10);
        menu.tambahMenuMakanan("Mie Ayam Baso", 15000, 20);
        menu.tambahMenuMakanan("Mie Ayam Baso Tulang", 22000, 10);
        menu.tambahMenuMakanan("Mie Baso", 12000, 25);
        menu.tambahMenuMakanan("Mie Baso Urat", 25000, 15);
        menu.tambahMenuMakanan("Mie Baso Urat Pleton", 35000, 20);
        menu.tambahMenuMakanan("Mie Yamin", 500, 20);
        menu.tambahMenuMakanan("Mie Yamin Ayam Baso", 33000, 15);
        menu.tambahMenuMakanan("Krupuk", 2000, 40);

        logger.log(Level.INFO, "Menu Makanan yang tersedia");
        menu.tampilMenuMakanan();

        menu.pesan(nomor, jumlah);

        logger.log(Level.INFO, "Terima kasih telah membeli makanan kami");
    }
}
