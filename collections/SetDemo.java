package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
//		HashSet hs = new HashSet();
//		hs.add(23);
//		hs.add(24);
//		hs.add(23);
//		System.out.println(hs);
		HashSet<EmployeeMain> hs = new HashSet<EmployeeMain>();
		hs.add(new EmployeeMain("pooja ", " EMP001", 24));
		hs.add(new EmployeeMain("Manvi ", " EMP002", 22));
		hs.add(new EmployeeMain("Madhu ", " EMP003", 34));
		hs.add(new EmployeeMain("pooja ", " EMP001", 24));
		hs.add(new EmployeeMain("Bablu ", " EMP005", 25));
		System.out.println(hs);
		System.out.println();

		System.out.println();
		System.out.println("using iterator");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
