package basic04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
 숫자가 같고, 자리수도 일치히면 S
 숫자는 같으나, 자리수가 다르면 B
 */
public class NumberBaseBall {
	public static void main(String[] args) {
		int c1, c2, c3;
		int h1, h2, h3;
		int s, b;
		int cnt = 0;
		
		do {
			// 컴퓨터로부터 임의의 숫자 3개
			c1 = 1 + (int) (Math.random() * 10);
			c2 = 1 + (int) (Math.random() * 10);
			c3 = 1 + (int) (Math.random() * 10);
		} while (c1 == c2 && c1 == c3 && c2 == c3);
		
		Scanner sc = new Scanner(System.in);
		
		do {
			cnt++;
			s = b = 0;
			System.out.println("0~9 사이의 서로다른 숫자 3개 입력");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			if(h1 == c1) s++;
			else if(h1==c2 || h1==c3) b++;
			
			if(h2 == c2) s++;
			else if(h2==c1 || h2==c3) b++;
			
			if(h3 == c3) s++;
			else if(h3==c1 || h2==c2) b++;
			
			System.out.println("S : " + s + " / B : " + c3);
		} while (s != 3);
		System.out.println("축하합니다. " + cnt + "번 만에 맞추셨습니다.");
		
	}
}
