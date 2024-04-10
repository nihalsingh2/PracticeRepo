package Relations;

public class Tester {

	public static void main(String[] args) {
	 Address ad=new Address("Mumbai","Maharashtra",2343);
	 Employee e=new Employee(1,"nihal",ad,10000,2000);
	 e.displayDetails();
	 System.out.println("the total Salary of employee is"+e.getSalary());
	}

}
