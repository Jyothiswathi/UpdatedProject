package CoreJava;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(1);
al.add(2);
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}
	}

}
