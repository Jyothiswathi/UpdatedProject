package CoreJava;

public class Interface3  implements Interface1,Interface2{
	
	public void displlay3()
	
	{
		System.out.println("display3");
	}

	@Override
	public void display1() {
System.out.println("display1");		
	}

	@Override
	public void display() {
System.out.println("display");		
	}
public static void main(String[] args) {
	Interface3 Interface3=new Interface3();
	
	Interface3.display1();
	
	
}
}
