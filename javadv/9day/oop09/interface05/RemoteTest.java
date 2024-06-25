package oop09.interface05;

public class RemoteTest {
	public static void main(String[] args) {
		RemoteControl tv = new LgRemoteTV();
		tv.channalDown();
		tv.channalUp();
	}
}
