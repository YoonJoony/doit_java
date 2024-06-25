package oop09.interface05;

public abstract class RemoteTV implements RemoteControl{

	@Override
	public void powerUp() {
		System.out.println("RemoteTV 전원을 켭니다");
	}

	@Override
	public void powerDown() {
		System.out.println("RemoteTV 전원을 끕니다");
	}

	@Override
	public void channalUp() {
		System.out.println("RemoteTV 채널을 올립니다");
	}
}
