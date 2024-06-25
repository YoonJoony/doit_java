package basic04;

public class LoopTest04 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int k = i; k < 5; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
