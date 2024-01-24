package practiceExtentMaven.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) {
		
		
		String s="hey this is joy joy";
		Map<String,Integer> m=new HashMap<String,Integer>();
		
		String[] s1 = s.split(" ");
		for(String x:s1)
		{
			if(m.containsKey(x))
			{
				m.put(x,m.get(x)+1);
			}
			else
			{
				m.put(x, 1);
			}
		}
		
	Set<String> wordsInString = m.keySet();
	for(String word:wordsInString)
	{
		if(m.get(word)>1)
		{
			System.out.println(word + " "+m.get(word));
		}
	}
		
		
		

	}

}
