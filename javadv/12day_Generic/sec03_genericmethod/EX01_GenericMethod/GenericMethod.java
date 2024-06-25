package sec03_genericmethod.EX01_GenericMethod;

public class GenericMethod {
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		
		String str1 = gm.<String>method1("안녕");
	}
}
