package practiceExtentMaven.collections;

public class Assending {

	public static void main(String[] args) {
		int a[]= {5,4,3,2,1};
		int temp;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
