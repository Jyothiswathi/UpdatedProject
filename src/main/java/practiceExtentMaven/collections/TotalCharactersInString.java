package practiceExtentMaven.collections;

public class TotalCharactersInString {
	
	public static void main(String[] args) {
		
		String a="jyothi";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
