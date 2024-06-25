package EX03_ThrowsException_3;

class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object"); // 일반예외 : ClassNotFoundException
			Thread.sleep(1000); // 일반예외 : InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			// 예외처리 구문
		}
	}
}

class B {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException | ClassNotFoundException e) {
			// 예외
		}
	}

	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object"); // 일반예외 : ClassNotFoundException
		Thread.sleep(1000); // 일반예외 : InterruptedException
	}
}

public class ThrowsException_3 {
	public static void main(String[] args) {
		
	}
}
