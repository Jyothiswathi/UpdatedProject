import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		al.add("banana");
		
		Set<String> s=new HashSet(al);
		//System.out.println(s);
		
		
		//using lemada expressions
		Function<List<String>, Set<String>> fs=(fruitList)->new HashSet(fruitList);
		System.out.println(fs.apply(al));
		
		//using method reference
		Function<List<String>, Set<String>> fs1=HashSet::new;
		System.out.println(fs1.apply(al));

		

		
		
	}

}
