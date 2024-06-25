package adsa;

import java.util.List;
import java.util.Scanner;

class Cal {
	public static double calCirArea(int r) {
		return (double) (r * 2 * 3.14);
	}
	public static int calSqurarea(int x, int y) {
		return (x * y);
	}
	public static double calATriarea(int x, int y) {
		return (double) (x * y / 2);
	}
}

public class FigureCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] figureList = {"원", "사각형", "삼각형"};
		
		System.out.print("넓이를 계산할 도형은?  1. 원 /2.사각형/ 3.삼각형> ");
		int figure = sc.nextInt();
		System.out.println();
		
		double area = 0;
		switch(figure) {
		case 1: {
			System.out.println("원의 넓이를 계산합니다");
			System.out.print("원의 반지름을 입력하세요 -> ");
			System.out.println();
			int redius = sc.nextInt();
			area = Cal.calCirArea(redius); 
			break;
		}
		case 2: {
			System.out.println("사각형의 넓이를 계산합니다");
			System.out.print("사각형의 가로 길이를 입력하세요 -> ");
			int x = sc.nextInt();
			System.out.print("사각형의 세로 길이를 입력하세요 -> ");
			int y = sc.nextInt();
			System.out.println();
			area = Cal.calSqurarea(x, y);
			break;
		}
		case 3: {
			System.out.println("삼각형의 넓이를 계산합니다");
			System.out.print("삼각형의 밑변 길이를 입력하세요 -> ");
			int x = sc.nextInt();
			System.out.print("삼각형의 높이 길이를 입력하세요 -> ");
			int y = sc.nextInt();
			System.out.println();
			
			area = Cal.calATriarea(x, y); 
			break;
		}
		default: System.out.println("에러");
		
		}
		
		System.out.println(figureList[figure-1] + "의 넓이는 : " + area);
	}
	
}
