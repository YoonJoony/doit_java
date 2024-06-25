// 411 페이지
interface A411 {
	int a = 3;
	void abc();
}

public class CreateObjectOfInterface_2 {
	public static void main(String[] args) {
		A411 a = new A411() {
			public void abc( ) {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		a.abc();
	}
}
