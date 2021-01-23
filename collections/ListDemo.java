package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<EmployeeMain> arrayList = new ArrayList<EmployeeMain>();
		arrayList.add(new EmployeeMain("pooja ", " EMP001", 24));
		arrayList.add(new EmployeeMain("Manvi ", " EMP002", 22));
		arrayList.add(new EmployeeMain("Madhu ", " EMP003", 34));
		arrayList.add(new EmployeeMain("Mansi ", " EMP004", 31));
		arrayList.add(new EmployeeMain("Bablu ", " EMP005", 25));

		System.out.println(arrayList);
		arrayList.remove(2);
		arrayList.add(2, new EmployeeMain("Anjali ", "EMP006", 24));
		System.out.println("SizeOf List :" + arrayList.size());

		// here using Iterator
		Iterator it = arrayList.iterator();
		System.out.println();
		System.out.println("EmpName:" + "EmpId :" + "age :");
		while (it.hasNext()) {
			//it.remove();//java.lang.IllegalStateException

			System.out.println(it.next());
			it.remove();
		}
		System.out.println(arrayList);
	}

}
