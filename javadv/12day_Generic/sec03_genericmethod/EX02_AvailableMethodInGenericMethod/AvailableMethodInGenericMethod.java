package sec03_genericmethod.EX02_AvailableMethodInGenericMethod;


public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");
	}
}
