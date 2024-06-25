package oop15.enum04;

import java.util.Scanner;

public class EnumTest2 {
	public static void main(String[] args) {
		System.out.println("SEOUL, BUSAN, JEJU >>");
		Scanner sc = new Scanner(System.in);
		
		String where = sc.nextLine();
		where = where.toUpperCase(); // 문자를 전부 대문자로 변환
		
		City city = City.valueOf(where); // 입력한 문자열에 맞는 객체를 반환
		switch (city){
		case SEOUL: System.out.println("서울의 인구 : " + city.getPopulation()); 
					break;
		case BUSAN: System.out.println("부산의 인구 : " + city.getPopulation()); 
					break;
		case JEJU: System.out.println("제주도의 인구 : " + city.getPopulation()); 
					break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + city);
		}
	}
}
