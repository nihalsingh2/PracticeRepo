package MyColllections;
import java.util.*;

public class Customer implements MyInterface {
	private int custId;
	private String name;
	private int rating;
	
	Customer(){
		
	}
	
	public Customer(int custId, String name,int rating) {
		this.custId = custId;
		this.name = name;
		this.rating = rating;
	}
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	List <Customer> custlist= new ArrayList<Customer>();
	void khela() {
	custlist.add(new Customer(101,"nihal",5));
	custlist.add(new Customer(102,"john",3));
	custlist.add(new Customer(103,"Johhny",4));
	}
	
	
	
	void display() {
		System.out.println("hello");
		Iterator i=custlist.iterator();
		System.out.println(custlist.get(0).getName());
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
	}
	

