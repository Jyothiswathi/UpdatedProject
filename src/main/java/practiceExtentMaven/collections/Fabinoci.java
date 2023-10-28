package practiceExtentMaven.collections;

public class Fabinoci {

	public static void main(String[] args) {
		int firsst=1,second=1,c;
		for(int i=1;i<=10;i++)
		{
			c=firsst+second;
			System.out.println(c);
			firsst=second;
			second=c;
			
		}
			

	}

}
