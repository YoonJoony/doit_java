package sec01_lambdaexpression.EX02_FunctionToLambdaExpression;


interface A { // 입력 X   리턴 X
	void method1();
}
interface B { // 입력 O   리턴 X
	void method2(int a);
}
interface C { // 입력 X   리턴 O
	int method3();
}
interface D { // 입력 O   리턴 O
	double method4(int a, double b);
}

public class FunctionToLambdaExpression {
	public static void main(String[] args) {
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("입력 x 리턴 x 함수");
			}
		};
		a1.method1();
		
		A a2 = () -> {System.out.println("람다 a2");};
		a2.method1();
		A a3 = () -> System.out.println("람다2 a2");
		a3.method1();
		
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("익명 B : " + a);
			}
		};
		b1.method2(10);
		B b2 = (int x) -> {System.out.println("람다1 B : " + x);};
		b2.method2(100);
		B b3 = (x) -> System.out.println("람다2 B : " + x);
		b3.method2(200);
	}
}
