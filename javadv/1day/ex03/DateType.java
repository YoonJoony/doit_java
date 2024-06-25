package ex03;

public class DateType {
	public static void main(String[] args) {
		boolean bool = false;
		System.out.println("b1 : " + bool);
		
		//char c = 'A';
		char c = 5123;

		System.out.println("c : " + c);
		
		byte b = 127;
		System.out.println("b : " + b);
		
		short s = 32;
		System.out.println("s : " + b);
				
		int i = 2147483647;
		System.out.println("i : " + i);
		
		long l1 = 2147483648L;
		System.out.println("l1 : " + l1);
		
		double d1 = 3.14159265358979;
		System.out.println("d1 : " + d1);
		
		//escape sequence
		System.out.println("그가 말했다. \"안녕하세요.\"");
		System.out.println("안녕하세요\n반갑습니다.");
		System.out.println("0\t1\t2\t3");
		
		float f = 3.123232323232f;
		System.out.println("f : " + f);
		
		String str = """
				만나서 반갑습니다.
				좋은 하루 되세요.
				""";
		
		System.out.println(str);
	}
}
