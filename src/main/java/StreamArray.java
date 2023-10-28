import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamArray {
	
	public static void main(String[] args) {
		
		Stream<String> stream= Stream.of("a","b","c");
		stream.forEach(System.out::println);
	List<String>	 al=Arrays.asList("a","b","a")	;
Set<String> s=new HashSet<String>	(al)	;
//System.out.println(s);
s.stream().forEach(System.out::println);


//converting array into stream

String a[]= {"l","m","n"};
Stream<String> a12 = Arrays.stream(a);
a12.forEach(System.out::println);


	}

}
