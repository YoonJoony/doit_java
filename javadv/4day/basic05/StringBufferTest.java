package basic05;

import java.io.PrintStream;
import java.security.Principal;

import javax.swing.plaf.synth.SynthProgressBarUI;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer ab = new StringBuffer();
		PrintStream(ab);
		
		ab.append("실수란 ");
		PrintStream(ab);
		ab.append("신을 용서하는 ");
		PrintStream(ab);
		ab.append("인간의 행위이다.");
		PrintStream(ab);
		
		ab.insert(16, "자비로운");
		PrintStream(ab);
		ab.delete(16, 21);
		PrintStream(ab);
	}

	private static void PrintStream(StringBuffer ab) {
		// TODO Auto-generated method stub
		System.out.println(ab.length() + " | " + ab.capacity());
		System.out.println(ab);
	}
}
