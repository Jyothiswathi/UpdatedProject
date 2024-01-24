package CoreJava;

public class This {
	
	
	int a=10;
	public void display()
	{
	int a=20;
	System.out.println(a);
	System.out.println(this.a);
	}

	public static void main(String[] args) {
		This display=new This();
		display.display();

	}

}
