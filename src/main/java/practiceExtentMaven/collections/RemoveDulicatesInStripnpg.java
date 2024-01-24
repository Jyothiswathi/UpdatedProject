package practiceExtentMaven.collections;

import java.util.HashSet;
import java.util.Set;

public class RemoveDulicatesInStripnpg {

	public static void main(String[] args) {
		
		String s="hi hi this is jyothi";
		String[] s1 = s.split(" ");
		String newString="";
		Set<String> s2=new HashSet<String>();
		for(String x:s1)
		{
		s2.add(x);
		}
		for(String x:s2)
		{
			System.out.print(x+ " ");
		}
		
		
	}
	
	
	
	
	

}
