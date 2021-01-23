package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("one", 1);
		hMap.put("Two", 2);
		hMap.put("Three", 3);
		hMap.put("Four", 4);
		hMap.put("Five", 5);
//		Optional<String> optionalhmap = hMap.entrySet().stream().filter(e -> "one".equals(e.getValue()))
//				.map(Map.Entry::getKey).findAny();
//		assertEquals("1", optionalhmap.get());

		for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}
		System.out.println();
		System.out.println("Using Stream");
		hMap.entrySet().forEach(entry -> {
			System.out.println("Key : " + entry.getKey() + " " + " Value : " + entry.getValue());
		});
	}

}
