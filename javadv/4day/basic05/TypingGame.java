package basic05;

import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] keyword = {
				"pop",
				"priative type",
				"far",
				"while",
				"Scanner",
				"constructor",
				"instance",
				"class",
				"ingeritance",
				"information hiding"
		};
		int[] item = new int[5];
		
		for(int i = 0; i < item.length; i++) {
			item[i] = (int)(Math.random() + keyword.length); 
		}
		
		for(int i = 0; i < item.length; i++) {
			item[i]= (int) (Math.random()) * keyword.length;
			for(int j = 0; j < i; j++) {
				if(item[i]== item[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("Game Start");
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < item.length; i++) {
			System.out.print(keyword[item[i]] + " ☜");
			String inputString = sc.nextLine();
			if(!inputString.equals(keyword[item[i]])) {
				System.out.println("typing miss");
				i--;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("총 소요 시간은 " + (endTime - startTime) + "초 입니다.");
	}
}
