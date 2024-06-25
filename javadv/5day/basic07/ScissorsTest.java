package basic07;

import java.util.Scanner;

public class ScissorsTest {
	public static void main(String[] args) {
		String[] caption = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		int you = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("YOU : " + caption[you-1]);
		System.out.println("COM : " + caption[com-1]);
		System.out.println();
		System.out.println(getMassage(you, com));
	}
	
	private static String getMassage(int you, int com) {
		switch (you) {
		case 1:
			if(you == 2) {
				return "당신이 졌습니다.";
			} else if(com == 3) {
				return "당신이 이겼습니다.";
			} else {
				return "서로 비겼습니다.";
			}
		case 2:
			if(com == 3) {
				return "당신이 졌습니다.";
			} else if(com == 1) {
				return "당신이 이겼습니다.";
			} else {
				return "서로 비겼습니다.";
			}
		case 3:
			if(com == 1) {
				return "당신이 졌습니다.";
			} else if(com == 2) {
				return "당신이 이겼습니다.";
			} else {
				return "서로 비겼습니다.";
			}
		}
		return "에러";
	}
}
