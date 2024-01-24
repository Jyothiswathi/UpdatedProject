package CoreJava;

public class StaticVariable {
static int a=10;
static Object student2()

{
	System.out.println("hello");
	return a;
}
	public static void main(String[] args) {
		
		System.out.println(a);
		student2();
	}

}
