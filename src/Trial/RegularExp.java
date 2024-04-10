package Trial;

public class RegularExp {
	
	String name="NIHAL?2";
	String regex="[A-Za-z0-9]{0,5}[\\s]{2}[\\d]{0,2}";
	String name2="Nihal23";
	
	public boolean isCheck() {
		if(name2.matches(regex))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		RegularExp re=new RegularExp();
		System.out.println(re.isCheck());

	}

}
