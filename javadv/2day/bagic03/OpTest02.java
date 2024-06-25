package bagic03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		List<Object> list = new ArrayList<>();
		
		
		System.out.print("정수 A값 입력 : ");		
		int a = sc.nextInt();
		
		System.out.print("정수 B값 입력 : ");
		int b = sc.nextInt();
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a !=  b);
		
		

	}
}
