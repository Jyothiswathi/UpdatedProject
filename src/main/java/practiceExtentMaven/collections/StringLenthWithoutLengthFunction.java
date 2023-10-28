package practiceExtentMaven.collections;

public class StringLenthWithoutLengthFunction {

	public static void main(String[] args) {
String s="this is jyothi";
int lenegth=0;
char[] ca=s.toCharArray();
	for(char x:ca)
	{
		lenegth++;
	}
	System.out.println(lenegth);
	System.out.println(s.length());
	}
}
