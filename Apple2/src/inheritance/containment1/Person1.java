package inheritance.containment1;

public class Person1 {
	private String name,contact;
	private int age;
    IdProof1 id;
   
    public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	public String getContact()
	{
		return contact;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
    public int getAge()
    {
    	return age;
    }
    
    public void setId(IdProof1 id)
    {
    	this.id=id;
    }
    public IdProof1 getId()
    {
    	return id;
    }
}
