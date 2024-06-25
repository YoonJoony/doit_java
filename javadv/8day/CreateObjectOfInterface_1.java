// 410 페이지
interface A410{
	public int a = 3;
	public void abc();
}

class B410 implements A410{
	public void abc() {
		System.out.println("방법 1. 자식 클래스 생성자로 객체 생성");
	}
}

public class CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		B410 b = new B410();
		A410 a = new B410();
		b.abc();
		a.abc();
	}
}
