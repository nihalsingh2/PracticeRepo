package Trial;
import java.util.*;
public class DataStructure {
	
	List <Integer> mylist=new ArrayList<Integer>();
	void add() {
		mylist.add(90);
		mylist.add(3432);
		mylist.add(34);
		mylist.add(2,5343);  //
		mylist.remove(1);   //removed using index
		Collections.sort(mylist);
		boolean isEmpty=mylist.isEmpty();
		boolean isContain=mylist.contains(334);
		System.out.println(isEmpty); 
		System.out.println(isContain);
		
		
		Name a=new Name("Nihal","Manoj","Singh");
		Name b=new Name("Nilesh","Manoj","Singh");
		Name c=new Name("Nikita","Manoj","Singh");
		
		List <Name> names=new ArrayList<>();
		List <Name> mynames=new LinkedList<>();
		names.add(a); 
		names.add(b);
		names.add(c);
		
		Iterator i=names.iterator();
		System.out.println(i.hasNext());
		System.out.println(i.next());
		
	for(Name w:names)
		{
			System.out.println(w);
		}
		
	}

}
