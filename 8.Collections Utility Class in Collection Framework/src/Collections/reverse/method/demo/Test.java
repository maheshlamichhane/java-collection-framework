package Collections.reverse.method.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		ArrayList I = new ArrayList();
		I.add(15);
		I.add(0);
		I.add(20);
		I.add(10);
		I.add(5);
		
		System.out.println(I);
		Collections.reverse(I); 
		System.out.println(I);

	}

}
