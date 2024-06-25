package oop19.generic01;

public class IntegerTest {
	public static void main(String[] args) {
		// Integer -> int의 wrapper 클래스. 필드에 기본 데이터 유형으로 저장하여 감쌈.
		Integer integer = 10; // 오토 박싱 Integer.valueOf(10)
		System.out.println(integer);
		
		int n = integer; // 오토 언박싱
	}
}
