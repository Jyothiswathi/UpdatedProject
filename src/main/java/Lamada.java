



public class Lamada implements lamadainterface{

	
	
	public static void main(String args[])
	{
		lamadainterface lamadainterface	=(a, b) ->(a+b);			
		
		int add = lamadainterface.sum(10,20);
		System.out.println(add);
	}

	@Override
	public int  sum(int a,int b) {
		return a+b;		
	}

}
