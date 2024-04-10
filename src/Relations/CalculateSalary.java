package Relations;

//Association

public class CalculateSalary {
	int basicSalary;
	int bonus;
	int total;
	
	public CalculateSalary(int basicSalary,int bonus) {
		this.basicSalary = basicSalary;
		this.bonus = bonus;
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
	
	public int getTotalSalary()
	{
		return total=basicSalary+bonus;
	}
	
	
	

}
