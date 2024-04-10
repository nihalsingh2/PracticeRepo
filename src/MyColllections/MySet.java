package MyColllections;
import java.util.*;

public class MySet {
	
	private int id;
	private String name;
	private String address;
	
	public MySet() {
		System.out.println("inside cons");
	}
	public MySet(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	Set <MySet> details=new LinkedHashSet<>();
	void operations() {
	details.add(new MySet(1,"nihal","india"));
	details.add(new MySet(1,"nihal","india"));
	details.add(new MySet(2,"John","Italy"));
	}
	
	void display() {
		System.out.println("hello");
		Iterator i=details.iterator();
	//	System.out.println(details.get());
		System.out.println(details.contains(new MySet(1,"nihal","india")));
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySet other = (MySet) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MySet [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	boolean validate(String name) {
		String regex="[A-z]";
		if(name.matches(regex))
		{
			return true;
		}
		return false;
	}
	


}
