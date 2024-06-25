package basic04;

import java.util.Scanner;

/*
 향상된 switch문으로 작성
 계절이 출력됩니다. 현재 월을 입력하세요: 
 ex) 8 -> 여름
 	3,4,5
 	6,7,8
 	9,10,11
 	12,1,2
 */
public class SwitchTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String temp = switch(n) {
		case 3,4,5 -> "봄";
		case 6,7,8 -> "여름";
		case 9,10,11 -> "가을";
		case 12,1,2 -> "겨울";
		default -> "???";
		};
		
		System.out.println(temp);
	}
}
