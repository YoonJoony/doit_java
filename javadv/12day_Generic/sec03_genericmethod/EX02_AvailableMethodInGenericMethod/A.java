package sec03_genericmethod.EX02_AvailableMethodInGenericMethod;

public class A {
	public <T> void method(T t) {
		System.out.println(t.equals("안녕"));
	}
}
