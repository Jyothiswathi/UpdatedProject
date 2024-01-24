package practiceExtentMaven.collections;

public class Prme {

	public static void main(String[] args) {

		int a = 13;
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
