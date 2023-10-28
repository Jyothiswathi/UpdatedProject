package practiceExtentMaven.collections;

public class RemovespecialChars {

	public static void main(String[] args) {
		String  gmail="jyothi.t@stradegi.com";
	String	m=gmail.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(m);

	}

}
