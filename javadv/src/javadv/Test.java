package javadv;

public class Test {
	int cal(int...score) {
		int sum = 0;
		for(int k = 0; k < score.length; k++) {
			sum += score[k];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.cal(1, 2, 3, 5,6));
	}
}
