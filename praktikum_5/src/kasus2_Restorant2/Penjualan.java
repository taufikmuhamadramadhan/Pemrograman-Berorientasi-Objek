package kasus2_Restorant2;

public class Penjualan {
    private String[] namaMakanan;
    private double [] hargaMakanan;
    private int [] stok;
    private static byte id = 0;


    public Penjualan() {
        namaMakanan = new String[10];
        hargaMakanan = new double [10];
        stok = new int [10];
    } 

    public void tambahMenuMakanan (String nama, double harga, int stok ) {
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
        this.nextId();
    }

    public void tampilMenuMakanan() {
    	System.out.println();
        for (int i = 0; i < id; i++) {
            if(!isOutOfStock(i)) {
            	
                System.out.println(i+1+ " " +namaMakanan[i] + "["+stok[i]+"]"+"\tRp. "+hargaMakanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if(stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void nextId() {
        id++;
    }
    
    public void pesan(Byte no, int jumlah) {
        if(cekStok(no,jumlah)){
            decreaseStok(no,jumlah);
            System.out.println("\nMakanan yang dipesan adalah "+namaMakanan[no-1]+" sebanyak "+jumlah+" buah");
            System.out.println("total harga yang harus dibayar adalah Rp."+hargaMakanan[no-1]*jumlah);
            
            System.out.println("\nMenu Makanan yang tersisa adalah");
            tampilMenuMakanan();
        }   else {
            System.out.print("stok barang kurang\n");
        }
    }

    public boolean cekStok(Byte no, int jumlah){
        if(stok[no-1]-jumlah < 0) return false;
        else return true;
    }

    public void decreaseStok(byte no, int jumlah){
        stok[no-1] -= jumlah;
    }

}
