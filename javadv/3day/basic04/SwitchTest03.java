package basic04;

import java.util.Scanner;

public class SwitchTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String score = switch (n/10) {
		case 9, 10 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		
		System.out.printf("%d점은 %s학점입니다.\n", n, score);
	}
}
