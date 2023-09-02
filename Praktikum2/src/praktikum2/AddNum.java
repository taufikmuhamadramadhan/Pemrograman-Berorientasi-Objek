package praktikum2;

/**
 * <h1> Add Two Number </h1>
 * AddNum adalah program yang mengimplementasikan aplikasi dimana menghitung dua integer
 * dan menampilkan hasil dari operasi perjumlahannya
 * <p>
 * <b>Note</b> Memberikan komentar pada program akan membuat program menjadi lebih 
 * user friendly dan meningkatkan kualitas program
 *  
 *  
 *  @author Taufik Muhamad Ramadhan
 *  @version 1.0
 *  @since 2023-08-31
 */
	
public class AddNum {
	/**
	 * Method ini menggunakan dua integer. Ini adalah mempermudah penggunaan dari class method
	 * @param numA adalah parameter pertama yang digunakan di method addNum
	 * @param numB adalah parameter kedua yang digunakan di method addNum
	 * @return int ialah mengembalikan nilai hasil perjumlahan numA dan numB
	 * 
	 */
	
	public int addNum(int numA, int numB) {
		return numA + numB;
	}
	
	/**
	 * Ini adalah method main yang menggunakan method addNum
	 * @param args used
	 * @exception IOexcaption on input error
	 * @see IOexcaption
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNum obj = new AddNum();
		int sum = obj.addNum(2, 8);
		
		System.out.println("Hasil perjumlahan  dari 2 dan 8 adalah : " + sum);
	}

}
