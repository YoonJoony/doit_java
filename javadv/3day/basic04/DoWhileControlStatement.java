package basic04;

public class DoWhileControlStatement {
	public static void main(String[] args) {
		int a;
		a = 0;
		while(a < 0) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.println(a + " ");
			a++;	
		} while(a < 0);
		
	}
}
