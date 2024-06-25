package oop12.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class A implements Cloneable {
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CheckedException {
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, IOException {
		Thread.sleep(1000);
		
		Class cls = Class.forName("java.lang.Object");
		InputStreamReader in = new InputStreamReader(System.in);
		in.read();
		
		FileInputStream fiStream = new FileInputStream("text.txt");
		
		
				
	}
}
