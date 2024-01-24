package practiceExtentMaven.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccuranceOfCharacters {

	public static void main(String[] args) {

		String a = "aabbccc";
		char[] eachCharacter = a.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char x : eachCharacter) {
			if (m.containsKey(x)) {
				m.put(x, m.get(x) + 1);
			} else {
				m.put(x, 1);
			}
		}

		System.out.println(m);
		Object[] keys = m.keySet().toArray();
		int max = m.get(keys[0]);
		char c = (char) keys[0];
		for (int i = 0; i < keys.length; i++) {
			if (max < m.get(keys[i])) {
				max = m.get(keys[i]);
				c = (char) keys[i];
				System.out.println(c);
			}

		}
		System.out.println(c + "=" + max);

	}
}
