package practiceExtentMaven.collections;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacters {

	public static void main(String[] args) {
		String s="jyothiii";
		Map<Character, Integer> h=new HashMap<Character,Integer>();

char[] s1 = s.toCharArray();
for(char x:s1)
{
//	HashMap<Character,Integer>= new HashMap<Character,Integer>();
	if(h.containsKey(x))
	{
		h.put(x, h.get(x)+1);
		
	}
	else
	{
		h.put(x, 1);
	}

}
System.out.println(h);



		
		
		
		

		
		
	}

}
