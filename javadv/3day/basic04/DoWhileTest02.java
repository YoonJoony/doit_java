package basic04;

// 주사위 2번 던져서 
public class DoWhileTest02 {
	public static void main(String[] args) {
		int n1, n2;
		n1 = 1 + (int) (Math.random() * 6);
		do {
			n2 = 1 + (int) (Math.random() * 6);
		} while (n1 == n2);
		
		System.out.println(n1 + " " + n2);
	}
}
