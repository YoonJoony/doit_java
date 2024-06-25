package oop15.enum06;

public class ThreadTest {
	public static void main(String[] args) {
		
		//SMIFileThread 객체 생성 및 시작
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		//VideoFileThread 객체 생성 및 시작
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.start();
		
	}
}
