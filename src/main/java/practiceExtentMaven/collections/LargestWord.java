package practiceExtentMaven.collections;

public class LargestWord {
	
	public static void main(String[] args) {
		String s="this is jyothi";
		String largest="";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].length()>largest.length())
			{
				largest=s1[i];
			}
		}
		System.out.println(largest);
	}

}
