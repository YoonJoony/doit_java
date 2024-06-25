package basic06;

public class MethodTest01 {
	public static void main(String[] args) {
		print();
		int a = 7, b = 4;
		System.out.println(a+ " + " + b + " : " + add(a, b));
		System.out.println(a+ " + " + b + " : " + sub(a, b));
		System.out.println(a+ " + " + b + " : " + mol(a, b));
		System.out.println(a+ " + " + b + " : " + div(a, b));
		System.out.println(a+ " + " + b + " : " + mod(a, b));
	}
	
	private static int mod(int a, int b) {
		return a % b;
	}

	private static int div(int a, int b) {
		return a / b;
	}

	private static int mol(int a, int b) {
		return a * b;
	}

	private static int sub(int a, int b) {
		return a - b;
	}

	private static int add(int a, int b) {
		return a + b;
	}
	
	private static void print(String name) {
		System.out.println("Hello " + name);
	}
	
	private static void print() {
		System.out.println("안녕");
		return;
	}
}
