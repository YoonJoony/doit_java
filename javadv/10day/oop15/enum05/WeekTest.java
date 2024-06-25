package oop15.enum05;

import java.util.Calendar;

public class WeekTest {
	public static void main(String[] args) {
		Week todayWeek = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week){
		case 1: todayWeek = Week.SUNDAY; break;
		case 2: todayWeek = Week.MONDAY; break;
		case 3: todayWeek = Week.TUESDAT; break;
		case 4: todayWeek = Week.WHENSDAY; break;
		case 5: todayWeek = Week.THIRSDAY; break;
		case 6: todayWeek = Week.FRIDAY; break;
		case 7: todayWeek = Week.SATURDAY; break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + week);
		}
		
		System.out.println(todayWeek);
	}
}
