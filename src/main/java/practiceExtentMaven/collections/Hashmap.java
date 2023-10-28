package practiceExtentMaven.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
	HashMap<String,String>	s=new HashMap<String, String>();
	s.put("andhra", "vizag");
	s.put("Chennai", "solinganellur");
	s.put("Telangana", "Hybd");
	System.out.println(s.keySet());
	System.out.println(s.values());
	Set<Entry<String, String>> a = s.entrySet();
	System.out.println(a);
	for(Entry<String, String> x:a)
	{
if(x.getKey().contains("andhra"))
{
	System.out.println(x.getValue());
}
	}
	

	
	

	}

}
