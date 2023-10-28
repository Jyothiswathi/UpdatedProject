package practiceExtentMaven.collections;

import java.util.HashSet;
import java.util.Set;

public class Practice {

public static void main(String args[])
{
	String a="joy";
	
	String b="narmadha";
	a=a+b;
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	System.out.println(a);
	System.out.println(b);
}
}


