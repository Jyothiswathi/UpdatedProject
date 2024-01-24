package CoreJava;

public class Super2  extends Super{
	
	 public  void a()
	{
		 int a=20;
		System.out.println("hello");
		super.a();
		System.out.println(a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		Super2 Super2=new Super2();
		Super2.a();
		
		

	}

}
