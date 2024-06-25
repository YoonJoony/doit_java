package bagic03;

// 대입 연산자와 축약 표
public class OpTest16 {
	public static void main(String[] args) {
		// @대입 연산자
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		// @축약 표현
		int value2;
		value2 = 5; System.out.println(value2 += 2);
		value2 = 5; System.out.println(value2 -= 2);
		value2 = 5; System.out.println(value2 *= 2);
		value2 = 5; System.out.println(value2 /= 2);
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2);
		value2 = 5; System.out.println(value2 <<= 2);
		value2 = 5; System.out.println(value2 >>= 2);
		value2 = 5; System.out.println(value2 >>>= 2);
	}
}
