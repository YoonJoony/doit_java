package bagic03;

// 난수 발생 4 ~ 15 사이의 임의의 정수
// 600 ~ 2300 사이의 임의의 100단위 정수
public class OpTest10 {
	public static void main(String[] args) {
		System.out.println((int) (4 + Math.random() * 12));
		System.out.println((int) (6 + Math.random() * 18) * 100);
	}
}
