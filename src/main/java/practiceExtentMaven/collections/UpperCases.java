package practiceExtentMaven.collections;

public class UpperCases {

	public static void main(String[] args) {
		
		String s="JyothiSahu";
		String upper="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				upper=upper+s.charAt(i);
			}
			
		}
		System.out.println(upper);

	}

}
