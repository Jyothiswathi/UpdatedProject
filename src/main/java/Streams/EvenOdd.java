package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
	
	public static void main(String[] args) {
		//even
		List<Integer> al=Arrays.asList(1,2,3,4,5);
		List<Integer> even = al.stream().filter((a)->a%2==0).collect(Collectors.toList());
		System.out.println(even);
		//odd
		List<Integer>odd=al.stream().filter((a)->a%2!=0).collect(Collectors.toList());
		System.out.println(odd);
		//sorting
		
	List<Integer> sort = al.stream().sorted().collect(Collectors.toList());
	System.out.println(sort);
	//descending order

List<Integer> descending = al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())	;
	System.out.println(descending);
	
	
	}
	
	

}
