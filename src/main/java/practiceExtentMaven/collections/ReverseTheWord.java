package practiceExtentMaven.collections;

public class ReverseTheWord {
	
	public static void main(String[] args) {
		String s="this is jyothi";
		String revWord="";


	String[] s1 = s.split(" ");

	for(String x:s1)
	{
		String rev="";



		for(int i=x.length()-1;i>=0;i--)
		{

			rev=rev+x.charAt(i);
		}
		revWord =revWord+rev+" ";
	}
	System.out.println(revWord);
	
	}

}
