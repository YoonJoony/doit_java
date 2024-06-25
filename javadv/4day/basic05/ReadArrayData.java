package basic05;

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {
		int[] array = new int[] {3, 4, 5, 6, 7};
		
		// 배열의 길이 구하기
		System.out.println(array.length);
		
		// 출력하기 1
		System.out.println(array[0] + " ");
		System.out.println(array[1] + " ");
		System.out.println(array[2] + " ");
		System.out.println(array[3] + " ");
		System.out.println(array[4] + " ");
		System.out.println();
		
		// 출력하기 2
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]+ " ");
		
		// 출력하기 3 for-each문 사용
		for(int k: array) {
			System.out.println(k + " ");
		}
		System.out.println();
		
		// 출력하기 4
		System.out.println(Arrays.toString(array)); // Array 클래스의 toString() 메서드 사용
	}
}
