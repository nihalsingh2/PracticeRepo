package maphumai;
import java.util.*;
import java.util.Map.Entry;

public class MyTreeMap {
	int number;
	Customer c;
	
	Map <Integer,Customer> myMap=new TreeMap<>();
	
	void operations() {
		myMap.put(1,new Customer(101,"John"));
		myMap.put(2,new Customer(102,"Tom"));
		myMap.put(2,new Customer(103,"Kevin"));
		
		Set<Entry<Integer,Customer>> mySet = myMap.entrySet();
		
		for(Entry e:mySet)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
