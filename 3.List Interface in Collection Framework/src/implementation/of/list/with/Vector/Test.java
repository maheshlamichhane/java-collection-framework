package implementation.of.list.with.Vector;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.addElement("B");
		v.addElement("C");
		v.addElement("C");
		v.addElement("E");
		v.addElement("F");
		
		System.out.println(v);
		v.removeElement("B");
		System.out.println("Element at index 0="+v.elementAt(0));
		System.out.println("Size of the vector="+v.capacity());
		v.removeAllElements();
		System.out.println("Size of the vector="+v.capacity());
	}

}
