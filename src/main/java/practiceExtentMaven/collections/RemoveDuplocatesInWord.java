package practiceExtentMaven.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplocatesInWord {

	public static void main(String[] args) {

		String s = "this is jyothi jyothi";
		String[] eachWord = s.split(" ");
		Map<String, Integer> h = new HashMap<String, Integer>();
		for (int i = 0; i < eachWord.length; i++) {
			if (h.containsKey(eachWord[i])) {
				h.put(eachWord[i], h.get(eachWord[i]) + 1);
			} else {
				h.put(eachWord[i], 1);
			}
		}
		System.out.println(h);
//		Set<String> duplicates = h.keySet();
//		for (String d : duplicates) {
//			System.out.print(d+ " ");
//			
//		}

	}

}
