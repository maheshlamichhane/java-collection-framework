package map.implementation.with.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Programmer\\OneDrive\\Desktop\\Java Collections\\6.Map Interface in Collection Framework\\src\\map\\implementation\\with\\properties\\user-info.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag", "8888");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Programmer\\OneDrive\\Desktop\\Java Collections\\6.Map Interface in Collection Framework\\src\\map\\implementation\\with\\properties\\user-info.properties");
		p.store(fos, "Updated by mahesh lamichhane");

	}

}
