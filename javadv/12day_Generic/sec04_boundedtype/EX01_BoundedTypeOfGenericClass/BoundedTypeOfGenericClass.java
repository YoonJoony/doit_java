package sec04_boundedtype.EX01_BoundedTypeOfGenericClass;

// 제네릭 메서드 제한
public class BoundedTypeOfGenericClass {
	public static void main(String[] args) {
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D();
		
		d2.set(new B());
		d2.set(new C());
		
		//d3.set(new B());
		d3.set(new C());
		
		d4.set(new B());
		d4.set(new C());
	}
}
