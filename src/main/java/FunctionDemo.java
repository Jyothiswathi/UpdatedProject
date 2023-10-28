import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		
		//function interface will take two arguments  fist one  is input and  argument is output return type. and it contains  apply method
		
		
		Function<String, Integer> function =(String s)-> s.length();
		System.out.println(function.apply("Hello"));

	}

}
