package practiceExtentMaven.collections;

import java.util.HashSet;
import java.util.Set;

public class Max {

	public static void main(String[] args) {
		
	int a[]= {1,2,3,78};
	int max=0;
	for(int i=0;i<a.length;i++)
	{
	 max= a[0];
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println(max);
		
	}

}
