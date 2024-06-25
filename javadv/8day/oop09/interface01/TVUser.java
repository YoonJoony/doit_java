package oop09.interface01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("8day/oop09/interface01/product.properties"));
		String tvName = prop.getProperty("tv");
		Class tvClass = Class.forName(tvName);
		TV tv = (TV) tvClass.getConstructor().newInstance();
		
		String speakerName = prop.getProperty("speaker");
		Class speakerClass = Class.forName(speakerName);
		Speaker speaker = (Speaker) speakerClass.getConstructor().newInstance();
		tv.setSpeaker(speaker);
		
		
		
		//TV tv = new LgTV();
	    tv.turnOn();
	    tv.turnOff();
	    tv.channelUp();
	    tv.channelDown();
	    speaker.soundUp();
	    speaker.soundDown();
	}
}

