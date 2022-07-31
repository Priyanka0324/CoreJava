package Collections;

import java.util.HashMap;

public class MapEx {  // retrival would be much faster in Hashmap

	public static void main(String[] args) {


		HashMap<Integer, String> map1 = new HashMap<Integer,String>();

		map1.put(1, "Matt");
		map1.put(2, "Kate");
		map1.put(3, "John");
		map1.put(4, "Kathy");
		map1.put(5, "Matt");
		map1.put(100, "Sachin");

		System.out.println(map1);
		
		System.out.println("The data @ 4th key is :" + map1.get(4));
		System.out.println(map1.get(100));
		
		map1.remove(100);
		
		System.out.println(map1);
		
		for (Integer Key : map1.keySet()) {
			System.out.println("The key is : " +Key);
			System.out.println("The value of the key is : " +map1.get(Key));
		}
	}
}
