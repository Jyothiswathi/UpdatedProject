package practiceExtentMaven.collections;

import java.util.HashSet;
import java.util.Set;

public class Practice {

public static void main(String args[])
{
	
int a=33;
int rev=0;
while(a!=0)
{
	rev=rev*10+a%10;
	a=a/10;
}
System.out.println(rev);

if(a==rev)
{
System.out.println("palindrom");	
}
else
{
	System.out.println("not palindrome");
}
	
}}


