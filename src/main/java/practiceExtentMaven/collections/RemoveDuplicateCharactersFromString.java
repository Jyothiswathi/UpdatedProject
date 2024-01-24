package practiceExtentMaven.collections;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		String s = "hello";
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (newString.indexOf(ch) == -1) {
				newString = newString + s.charAt(i);
			}
		}
		System.out.println(newString);

	}

}
