package basic2;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("2");
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));
		System.out.println(2 - (float) 1.1);
	}
}
