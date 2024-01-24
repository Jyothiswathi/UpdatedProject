package CoreJava;

public class Upcasting1 extends upCasting {
	//we cant perform downcasting
	public void display()
	
	{
		System.out.println("child");
	}

	public static void main(String[] args) {
		upCasting upCasting=new Upcasting1();
		upCasting.display();
		
		
		
		//type casting of child class object to perent cast onject

	}

}
