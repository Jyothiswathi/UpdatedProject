package practiceExtentMaven.collections;

public class Vowels {
	public static void main(String[] args) {
		String s="jyothi";
		int vowlesCount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='a')
			{
				vowlesCount++;
			}
		}
		System.out.println(vowlesCount);
	}
	

}
