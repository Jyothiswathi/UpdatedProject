package CoreJava;

public class MethodOverriding2 extends MethodOverRiding {
	public void display()
	{
		System.out.println("hello");
		super.display();
	}
	public static void main(String[] args) {
		MethodOverriding2 MethodOverriding2=new MethodOverriding2();
		MethodOverriding2.display();
		
	}

}
