package Relations;

public class Employee {;
	int empId;
	String empName;
	Address address;
	int basicSalary;
	int bonus;
	int totalSalary;
	
	public Employee(int empId, String empName, Address address,int basicSalary,int bonus) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.basicSalary=basicSalary;
		this.bonus=bonus;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getSalary() {
		CalculateSalary cs=new CalculateSalary(basicSalary,bonus);
		this.totalSalary=cs.getTotalSalary();
		return totalSalary;
	}
	
	
	void displayDetails() {
		System.out.println("Employee id is"+empId);
		System.out.println("Employee name is"+empName);
		System.out.println("Employee lives in"+address.getCity()+address.getState());
		
	}
	
	
	

}
