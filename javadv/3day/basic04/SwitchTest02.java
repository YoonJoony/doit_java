package basic04;

import java.util.Scanner;

/* switch~case scanner
	1: 남자
	2: 여자
	3: 남자
	4: 여자
	default : 에러
*/
public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		n %= 2;
		switch (n) {
		case 1: 
			System.out.println("남자");
			break;
		case 0: 
			System.out.println("여자");
			break;
		default:
			System.out.println("에러");
		} */
		
		String string =  switch(n) {
			case 1, 3 -> "남자";
			case 2, 4 -> "여자";
			default -> "에러";
		};
		System.out.println(string);
	}
}
