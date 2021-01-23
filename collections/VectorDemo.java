package collections;

import java.util.*;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<EmployeeMain> v = new Vector<EmployeeMain>();
		v.addElement(new EmployeeMain("pooja ", " EMP001", 24));
		v.addElement(new EmployeeMain("Manvi ", " EMP002", 22));
		v.addElement(new EmployeeMain("Madhu ", " EMP003", 34));
		v.addElement(new EmployeeMain("Mansi ", " EMP004", 31));
		v.addElement(new EmployeeMain("Bablu ", " EMP005", 25));
	

		System.out.println(v);
		v.removeElementAt(2);
		v.addElement(new EmployeeMain("Anjali ", "EMP006", 24));
		System.out.println("SizeOf List :" + v.size());

		// Accessing The elemets in different ways
		// here usig forLoop
		System.out.println("using forLoop");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i) + " ");
		}
		System.out.println();
		System.out.println("using forEach loop");
		for (EmployeeMain obj : v) {
			System.out.println(obj);
		}
		// here Using Enumeration
		// only for Legacy classes
		// only forward direction for accessing elements
		System.out.println();
		System.out.println("using enumeration");
		Enumeration e = ((Vector<EmployeeMain>) v).elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
