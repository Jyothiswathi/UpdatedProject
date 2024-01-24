package practiceExtentMaven.collections;

import java.util.Scanner;

public class a4a3c6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);//aabbbccc
		System.out.println("input: ");
		String input = s.nextLine();
		s.close();
		runLengthEncoadiong(input);

	}
	
	public static void runLengthEncoadiong(String input)
	{
		String result="";
		int count=0;
		
		for(int i=0;i<input.length();i++)
		{
			if(i==0)
			{
				result= result+input.charAt(0);
				count++;
			}
			
			if((i!=0)&& (input.charAt(i)== input.charAt(i-1)))
					{
				count++;
					}
			
			else if( (i!=0)&& (input.charAt(i)!= input.charAt(i-1)))
			{
			result= result+count+input.charAt(i);
			count=1;
			}
			if(i==input.length()-1)
			{
				result=result+count;
			}
		}
		System.out.println("input :" +result);
		
		
		
		
		
	}

}
