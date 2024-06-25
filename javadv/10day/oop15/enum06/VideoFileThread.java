package oop15.enum06;

public class VideoFileThread extends Thread{

	@Override
	public void run() {
		//#1 비디오프레임 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		//#3. 비디오 프레임 출력
		for (int i=0; i<intArray.length; i++) {
			System.out.print("(비디오프레임) "+intArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
	
}
