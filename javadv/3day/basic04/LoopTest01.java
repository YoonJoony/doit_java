package basic04;

public class LoopTest01 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i <= 5; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
