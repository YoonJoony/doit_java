package basic2;

public class FloatBsDouble {
	public static void main(String[] args) {
		// float의 정밀도(대략 소수 7자리)
		float f1 = 1.0000001f; // 실수 기본 타입은 double 타입으로 읽혀서 f로 형변환
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		
		// double의 정밀도(소수 15자리)
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
	
	}
}
