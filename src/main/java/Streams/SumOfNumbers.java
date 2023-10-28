package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		Optional<Integer> sum;
		List<Integer> i=Arrays.asList(1,2,3);
	sum	=i.stream().reduce((a,b)->a+b);
	System.out.println(sum.get());
		
	}

}
