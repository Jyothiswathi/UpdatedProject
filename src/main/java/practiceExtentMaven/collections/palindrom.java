package practiceExtentMaven.collections;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		String s="sys";
	String	rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i)	;
		}
		
	if(rev.equals(s)) {
		System.out.println("palindrom");
		
	}
	else
	{
		System.out.println("not palindrome");
	}
		
	}

}
