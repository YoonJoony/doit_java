package basic07;

import java.lang.reflect.Method;

public class book242 {
	public static void main(String[] args) {
		method1(1, 2);
		method1(1, 2, 3);
		method1();
		
		method2("안녕", "방가");
		method2("떙큐", "베리", "감사");
		method2();
	}
	
	public static void method1(int...values) {
		System.out.println("배열의 길이 : " + values.length);
		for(int k: values) {
			System.out.println(k + " ");
		}
	}
	
	public static void method2(String...values) {
		System.out.println("배열의 길이 : " + values.length);
		for(String k: values) {
			System.out.println(k + " ");
		}
	}
}
