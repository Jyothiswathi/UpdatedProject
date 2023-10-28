package practiceExtentMaven.collections;

public class UpperLowerString {

	public static void main(String[] args) {
String s= "Welcome to World";
int upperCount=0;
int lowerCount=0;
for(int i=0;i<s.length();i++)
{
	
	if(s.charAt(i)>='A' &&s.charAt(i)<='Z' )
	{
		upperCount++;
	}
	else if(s.charAt(i)>='a' &&s.charAt(i)<='z' )
	{
		lowerCount++;
	}
}
System.out.println(upperCount);
System.out.println(lowerCount);


	}

}
