package sec04_boundedtype.EX01_BoundedTypeOfGenericClass;

class A{}
class B extends A {}
class C extends B {}

public class D<T extends B> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
