package basic07;

class A{
	A(){
		System.out.println("기본 생성자");
	}
	
	A(int a) {
		System.out.println("A(int a) 생성자 : " + a);
	}
	
	A(int a, int b) {
		System.out.println("A(int a, int b) 생성자 : " + a + " " + b);
	}
}

public class A4 {
	public static void main(String[] args) {
		A a = new A();
		A a2 = new A(1);
		A a3 = new A(1, 2);
	}
}
