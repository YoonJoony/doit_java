package oop12.exception;

class A466{}
class B extends A466{}

public class UncheckedException {
	public static void main(String[] args) {
		System.out.println(3 / 0);
		
		A466 a = new A466();
		B b = (B)a;
		
		int[] array = {1, 2, 3};
		System.out.println(array[3]);
		
		int num = Integer.parseInt("10!");
		
		String str = null;
		System.out.println(str.charAt(2));
	}
}
