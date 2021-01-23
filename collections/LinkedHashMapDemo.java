package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> lMap = new LinkedHashMap<String, Integer>();
		lMap.put("one", 1);
		lMap.put("Two", 2);
		lMap.put("Three", 3);
		lMap.put("Four", 4);
		lMap.put("Five", 5);
		System.out.println(lMap);

		Set s = lMap.keySet();
		System.out.println("keys :" + s);

		Iterator i = s.iterator();
		while (i.hasNext()) {
			Object obj = i.next();
			String str = (String) obj;
			System.out.println(str + " " + lMap.get(str));
		}
		Collection<Integer> c = lMap.values();
		System.out.println("values :" + c);

		System.out.println(lMap.containsKey("Four"));
		System.out.println(lMap.containsKey(7));
	}

}
