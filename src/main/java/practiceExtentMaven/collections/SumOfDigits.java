package practiceExtentMaven.collections;

public class SumOfDigits {

	public static void main(String[] args) {
int a=12345;
int sum=0;
int last=0;

while(a>0)
{
last=a%10;
sum=sum+last;
a=a/10;
}
System.out.println(sum);
	}

}
