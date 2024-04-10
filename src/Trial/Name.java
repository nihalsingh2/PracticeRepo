package Trial;

public class Name {
	String FName;
	String MName;
	String SName;
	private static int a=343;
	
	public Name(String FName,String MName,String SName)
	{
		this.FName = FName;
		this.MName = MName;
		this.SName = SName;
	}
	@Override
	public String toString()
	{
		return FName+":"+MName+":"+SName;
	}

	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		this.FName = fName;
	}
	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		this.MName = mName;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		this.SName = sName;
	}
	
	
	

}
