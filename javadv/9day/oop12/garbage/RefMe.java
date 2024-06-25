package oop12.garbage;

interface GarbageA {
	
}

interface GarbageB {
	
}

public class RefMe implements GarbageA, GarbageB{
	public RefMe() {
		System.out.println("태어남");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("아악 ㅜㅜ");
	}
}
