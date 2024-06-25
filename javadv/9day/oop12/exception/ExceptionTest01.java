package oop12.exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 0);
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("숫자는 0으로 나눌 수 없습ㄴ디ㅏ.");
			System.out.println("프로그램 종료");
		}
	}
}
