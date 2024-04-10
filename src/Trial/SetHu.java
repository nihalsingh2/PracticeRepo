package Trial;
import java.util.*;

public class SetHu {
	
	void myMethod() {
		
	Set <Integer> numbers=new TreeSet<>();
/*	myNames.add(new Name("Niahl","manoj","Singh"));
	myNames.add(new Name("Nilesh","manoj","Singh"));
	myNames.add(new Name("Nikita","manoj","Singh"));
	*/

/*	Iterator i=myNames.iterator();
	while(i.hasNext())
	{
		System.out.println(i);
	}
	*/
	int number=2;
	while(number<100)
	{
		if(isPrime(number))
		{
			numbers.add(number);
		}
		number++;
	}
	
	
	for(int i:numbers)
	{
		System.out.println(i);
	}
	
/*	for(Name n:myNames)
	{
		System.out.println(myNames);
	}*/
	}
	
	static boolean isPrime(int num)
	{
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

	

}
