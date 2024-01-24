package CoreJava;

public class Abstract2 extends Abstract1 {
	public void dispaly3() {
		System.out.println("display3");
	}

	@Override
	void display() {
		System.out.println("abstract2");
	}

	public static void main(String args[]) {
		Abstract2 Abstract2 = new Abstract2();
		Abstract2.display();
		
	}

}
