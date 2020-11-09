package finance;

import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		HashMap<String, Integer> test = new HashMap<String, Integer>();
		test.put("Item 1", 25);
		test.put("Item 2", 50);
		test.put("Item 3", 75);
		test.put("Item 4", 100);
		System.out.println(test);
		test.put("Item 1", 20);
		System.out.println(test);
		
	}

}
