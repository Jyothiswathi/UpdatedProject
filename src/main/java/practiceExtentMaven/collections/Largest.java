package practiceExtentMaven.collections;

public class Largest {

	public static void main(String[] args) {
int a[]= {10,40,30};
int  largest=a[0];
for(int i=0;i<a.length;i++)
{
	if(a[i]>a[0])
	{
		a[0]=a[i];
	}
}
System.out.println(a[0]);
	}

}
