package basic04;

import java.lang.foreign.ValueLayout.OfBoolean;
import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else if(score >= 0){
			System.out.println("F");
		} else {
			System.out.println("점수 에러");
		}
	}
}
