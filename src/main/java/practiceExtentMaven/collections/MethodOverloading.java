package practiceExtentMaven.collections;

public class MethodOverloading {
	int a;
	MethodOverloading()
	{
		System.out.println("hii");
	}
	
	MethodOverloading(int b)
	{
		a=b;
		System.out.println(a);
		
		
		
	}
	public void student()
	{
		System.out.println("student");
	}
	
	public void student(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		MethodOverloading MethodOverloading=new MethodOverloading();
		MethodOverloading MethodOverloading1=new MethodOverloading(1);	

		MethodOverloading1.student();
		MethodOverloading.student(2);
		System.out.println(Static.student2);
	
	}

}
