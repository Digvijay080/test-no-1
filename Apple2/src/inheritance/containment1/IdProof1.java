package inheritance.containment1;

public class IdProof1 {
	private int number;
	private String name,address;
	
	public void setNumber(int number)
	{
		this.number=number;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public String toString()
	{
		return name+" "+number+" "+address;
	}
}
