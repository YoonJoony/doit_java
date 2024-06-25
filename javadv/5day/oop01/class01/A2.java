package oop01.class01;

public class A2 {
	int m = 1;
	int n = 4;
	
	void work() {
		int k = 5;
		System.out.println(k);
		work2(3);
	}

	private void work2(int i) {
		int j = 4;
		System.out.println(i + j);
	}
}
