package oop12.calender;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력");
		int year = sc.nextInt();
		System.out.println("월을 입력");
		int month = sc.nextInt();
		
		drawCalender(year, month);
		
	}

	private static void drawCalender(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		int sweek = 0; // 그 달의 첫 번째 날의 요일(일 : 1, 월 : 2..)
		int eday = 0;
		
		calendar.set(year, month - 1, 1);
		
		sweek = calendar.get(Calendar.DAY_OF_WEEK);
		eday = calendar.getActualMaximum(Calendar.DATE);
		System.out.println("  " + year + "년 " + month + "월");
		System.out.println(" 일 월 화 수 목 금 토 ");
		
		for(int i = 1; i < sweek; i++) {
			System.out.println("   ");
		}
		
		for(int d = 1, w = sweek; d <= eday; d++, w++) {
			System.out.print(d < 10? "  " + d : " " + d);
			if(w%7==0) System.out.println();
		}
	}
}
