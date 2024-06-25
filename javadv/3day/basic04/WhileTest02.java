package basic04;

/*
 1 ~ 1000까지
 */
public class WhileTest02 {
	public static void main(String[] args) {
		int i = 3;
		int sum = 0;
		while (i <= 1000) {
			sum += i;
			i += 3;
		}
		System.out.println(sum);
	}
}
