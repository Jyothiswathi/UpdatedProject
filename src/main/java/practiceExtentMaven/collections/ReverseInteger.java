package practiceExtentMaven.collections;

public class ReverseInteger {

	public static void main(String[] args) {
		
		long a=899;
		long rev=0;
		while(a!=0)
		{
			
			rev=rev*10+a%10;
			a=a/10;
			
		}
		System.out.println(rev);

	}

}
