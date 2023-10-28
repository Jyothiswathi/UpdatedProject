package practiceExtentMaven.collections;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		String names[]= {"joy","swathi","pavani","joy","swathi"};
		
		Set<String> s=new HashSet<String>();
		for(String eachName:names)
		{
		if(s.add(eachName)==false)	
		{
			System.out.println(eachName);
		}
		}
		
		


	
	}
	
	
	
	
	
	
	
	}

