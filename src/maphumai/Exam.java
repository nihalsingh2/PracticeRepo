package maphumai;
import java.util.*;
import java.util.Map.Entry;

public class Exam {
	Map <String,String> datalist=new HashMap<>();
	
	String addStudentDetails(String name,String id)
	{
	String smt;
	Set<Entry<String,String>> mySet = datalist.entrySet();	
		for(Entry e:mySet)
		{
			if(id.equals(e))
			{
				smt="Id generation Failed, name is already present in the database";
				return smt;
			}
		}	
		datalist.put(id, name);
		smt="Id Generated";
		return smt;		
	}
	
	String deleteId(String name)
	{
	  String smt="deleted";
		return smt;
	}
}
