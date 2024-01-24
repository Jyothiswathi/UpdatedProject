package CoreJava;

public class ustomException extends Exception {
	
	public ustomException(String str)
	{
		super(str);
	}
	

	public static void main(String[] args)  throws ustomException{
		
		try
		{
			int age=17;
			if(age<18)
			{
				throw new ustomException("age should be  18 not elgible");
			}
			else
			{
				System.out.println("u r elsbale for vote");
			}
			
		}
		catch(ustomException e)
		
		{
			e.printStackTrace();
		}
		
	}

}
