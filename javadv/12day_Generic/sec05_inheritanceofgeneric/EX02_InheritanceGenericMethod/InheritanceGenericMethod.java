package sec05_inheritanceofgeneric.EX02_InheritanceGenericMethod;

class Parent {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent { }

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		// 1. 부모 클래스 제네릭 메서드 이용
		Parent p1 = new Parent();
		p1.<Integer>print(19);
		p1.print(19);

		
		// 2. 자식 클래스 제네릭 메서드 이용
		Child c1 = new Child();
		c1.<Integer>print(111);
		c1.print(9.2);
		
	}
}
