package bagic03;

import java.util.Scanner;

public class OpTest07 {
	public static void main(String[] args) {
		int n = 1;
		System.out.println(n == 1 ? "남자입니다." : "여자입니다.");
		
		int s = 2;
		System.out.println(s == 1 ? "남자입니다." : s == 2 ? "여자입니다." : "에러입니다.");
		
		Scanner scanner = new Scanner(System.in);
		int inp = scanner.nextInt();
		
		System.out.println(inp == 1 | inp == 3 ? "남자입니다" : inp == 2 || inp == 4 ? "여자입니다." : "에러입니다.");
	}
}
