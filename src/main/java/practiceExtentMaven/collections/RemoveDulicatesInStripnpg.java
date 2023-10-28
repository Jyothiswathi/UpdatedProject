package practiceExtentMaven.collections;

import java.util.HashSet;
import java.util.Set;

public class RemoveDulicatesInStripnpg {

	public static void main(String[] args) {
		
		String s[]= {"jyo","joy","joy"};
		Set<String> s1=new HashSet<String>();
		for(String x:s)
		{
		if(s1.add(x)==false)	
		{
		System.out.println(x);	
		}
		}
		
		
		
	}

}
