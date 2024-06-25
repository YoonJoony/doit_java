package oop15.enum05;

public class EnumMethodTest {
	public static void main(String[] args) {
		Week todayWeek = Week.SUNDAY;
		String nameString = todayWeek.name();
		System.out.println(nameString);
		
		//2. ordinal() 메서드 : enum 상수 중 몇 번째 열거 객체인지 알려줌
		int ordinal = todayWeek.ordinal(); 
		System.out.println(ordinal);
		
		//3. X.compareTo(Y) : X 상수와 Y 상수의 인덱스 차이. 
		Week day1 = Week.MONDAY;
		Week day2 = Week.WHENSDAY;
		int result1 = day1.compareTo(day2);
		System.out.println(result1);
		int result2 = day2.compareTo(day1);
		System.out.println(result2);
		
		//4. 열거형 상수 전부 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
	
}
