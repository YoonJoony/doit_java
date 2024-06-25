package sec05_inheritanceofgeneric.EX01_InheritanceGenericClass;

class Parent<T> {
	T t;
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T> { }

class Child2<T, V> extends Parent<T> {
	V v;
	public V getV() {
		return v;
	}
	
	public void setV(V v) {
		this.v = v;
	}
}


public class InteritanceGenericClass {
	public static void main(String[] args) {
		// 1. 부모제네릭클ㄹ스
		Parent<String> p = new Parent<>();
		p.setT("부모제네릭클래스");
		System.out.println(p.getT());
		
		// 2. 자식 클래스1
		Child1<String> child1 = new Child1<>();
		child1.setT("자식1 제네릭클래스");
		System.out.println(child1.getT());
		
		// 3. 자식 클래스2
		Child2<String, Integer> child2 = new Child2<>();
		child2.setT("자식 2 제네릭 클래스");
		child2.setV(100);
		System.out.println(child2.getT());
		System.out.println(child2.getV());
	}
}
