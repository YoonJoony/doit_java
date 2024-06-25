package basic04;

import java.util.Scanner;

public class BreakTest02 {
	public static void main(String[] args) {
		int x = 1 + (int) (Math.random() * 100);
		int you = 0;
		int cnt = 1;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(cnt + ".1~100 사이의 정수를 입력 : ");
			you = sc.nextInt();
			if(x > you) System.out.println("UP");
			else if(x < you) System.out.println("DOWN");
			else break;
			cnt ++;
		} while(true);
		
		System.out.println("x는 " + x + "입니다." + cnt + "번 만에 맞추셨습니다.");
	}
}
