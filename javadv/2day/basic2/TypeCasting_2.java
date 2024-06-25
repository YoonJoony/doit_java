package basic2;

public class TypeCasting_2 {
	public static void main(String[] args) {
		float value1 = 3;
		float value2 = 5;
		double value3 = 7;
		byte value4 = 9;
		short value5 = 11;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		byte value6 = (byte)128; // int -> byte(다운캐스팅)
		int value7 = (int)3.5; // double -> int(다운캐스팅)
		float value8 = (float)7.5; // double -> float(다운캐스팅)
		
		System.out.println(value6);
		System.out.println(value7); 
		System.out.println(value8);
		System.out.println();
	}
}
