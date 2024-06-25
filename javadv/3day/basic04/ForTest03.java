package basic04;

import java.util.Scanner;

/*
 1부터 1000까지 정수 중 3의 배수를 구하시오.
 */
public class ForTest03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 3; i <= 1000; i += 3) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
