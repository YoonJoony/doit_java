package basic2;

public class RangeOfVariablueUse {
	public static void main(String[] args) {
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		} // 변수 value2가 사라짐
		
		System.out.println(value1);
		// System.out.println(value2);
	} // 변수 value1이 사라짐
}
