package oop12.garbage;

public class ReferenceTest {
	public static void main(String[] args) throws Throwable {
		RefMe r1 = new RefMe();
		RefMe r2 = r1;
		r1 = null;
		System.gc();
		r2 = null;
		System.gc();
		System.out.println("종료");
	}
}
