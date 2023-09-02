package case3n4_Operators;

public class ConvertDataType {
	static short methodOne (long l) {
		int i = (int) l;
		return (short)i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 10.45;
		float f = (float)d;
		byte b = (byte) methodOne((long) f);
		System.out.println(b);
	}

}
