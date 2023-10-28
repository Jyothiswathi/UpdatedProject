package practiceExtentMaven.collections;

public class CharDigitsNumbers {

	public static void main(String[] args) {
		String s="jyothiTelukula5@gmail.com";
		char ch[]=s.toCharArray();
		int isDigit=0;
		int isletter=0;
		int isOther=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(Character.isDigit(ch[i]))
			{
				isDigit++;
			}
			else if(Character.isLetter(ch[i]))
			{
				isletter++;
			}
			else
			{
				isOther++;
			}
		}
		System.out.println(isDigit);
		System.out.println(isletter);
		System.out.println(isOther);
}

}
