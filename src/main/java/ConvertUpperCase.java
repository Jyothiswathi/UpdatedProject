import java.util.function.Function;

public class ConvertUpperCase {

	public static void main(String[] args) {
		
		
	Function<String, String> f=(a)->a.toUpperCase();
System.out.println(f.apply("hello"));



//By using method referance

Function<String, String> f1=String::toUpperCase;
System.out.println(f1.apply("joy"));
	}

}
