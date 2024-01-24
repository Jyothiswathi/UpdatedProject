package practiceExtentMaven.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		String s="this is jyothi";
		String[] s1 = s.split(" ");
		int max=s1[0].length();
		String max1=s1[0];
		for(String x:s1)
		{
		if(max>x.length())
		{
			max=x.length();
			max1=x;
		}
		}
		System.out.println(max1+" "+max);
		
		
	}
	

}
