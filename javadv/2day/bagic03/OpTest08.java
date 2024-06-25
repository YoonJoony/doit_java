package bagic03;

import java.util.Scanner;

// 정수를 입력받아 짝수인지 홀수인지
public class OpTest08 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int inp = sc.nextInt();
		System.out.println(Math.abs(inp) % 2 == 0 && Math.abs(inp) != 0 ? "짝수입니다." : Math.abs(inp) % 2 != 0 && Math.abs(inp) != 0 ? "홀수입니다." : "0입니다.");
	}
}
