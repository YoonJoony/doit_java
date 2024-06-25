package oop19.generic01;

public class IntegerTest3 {
	public static void main(String[] args) {
		Integer a1 = Integer.valueOf(127);
		Integer a2 = Integer.valueOf(127);
		System.out.println(a1 == a2);
		
		Integer b1 = Integer.valueOf(122);
		Integer b2 = Integer.valueOf(122);
		System.out.println(b1 == b2);
	}
}
