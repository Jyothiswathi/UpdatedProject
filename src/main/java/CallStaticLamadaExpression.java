import java.util.Scanner;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.functions.BiFunction;

public class CallStaticLamadaExpression {

	public static void main(String[] args) throws Throwable {
		BiFunction<Integer, Integer,Integer > bifunction=(a,b)->StaticMethodExample.addation(a,b);
@NonNull
Integer a = bifunction.apply(1, 2);
		System.out.println(a);
		
		//using method referance
		BiFunction<Integer, Integer,Integer > bifun=StaticMethodExample::addation;
@NonNull
Integer a1 = bifunction.apply(1, 2);
		System.out.println(a1);

		
	}
	
	

}
