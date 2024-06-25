package bagic03;

public class OpTest03 {
	public static void main(String[] args) {
		boolean a, b;
		a= true; b = true;
		System.out.println(a && b); // AND
		System.out.println(a || b); // OR
		System.out.println(!a); // NOT

		a= true; b = false;
		System.out.println(a && b); 
		System.out.println(a || b); // OR

		a= false; b = true;
		System.out.println(a && b); 
		System.out.println(a || b); // OR

		a= false; b = false;
		System.out.println(a && b); 
		System.out.println(a || b);
		System.out.println(!b); 
	}
}
