package kasus1_ClassObj;

public class barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	public barang(String kode, String nama, int stk) 
	{ 
		kode_barang = kode;
		nama_barang = nama; 
		stok = stk;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok += stok;
	}
	
}
