package oop09.interface02;

public class BodyTest {
	public static void main(String[] args) {
		BodySign bSign = new Pitcher();
		bSign.throwBall(BodySign.CENTER);
		bSign.throwBall(BodySign.LEFT);
		bSign.throwBall(BodySign.DOWN);
	}
}
