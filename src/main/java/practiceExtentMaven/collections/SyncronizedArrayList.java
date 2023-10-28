package practiceExtentMaven.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizedArrayList {

	public static void main(String[] args) {
		
	//by usings collection.syncronization  method 
		//by using copyOnWriteArrayList class we can acess thread shafe and syncrionization in arraylist
List<String>	namesList	=Collections.synchronizedList(new ArrayList<String>());
namesList.add("Joy");
namesList.add("Pavani");
synchronized (namesList) {
	
Iterator<String> it	=namesList.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	
	
	
}
//for Threadshafe synchronized list
CopyOnWriteArrayList<String> emplist=new CopyOnWriteArrayList<String>();
emplist.add("joy");
emplist.add("Swathi");

Iterator<String>it=emplist.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());	
		}
		

	}

}
