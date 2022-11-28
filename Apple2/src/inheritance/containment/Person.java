package inheritance.containment;

public class Person {
	private int id,age;
	private String name,contact;
	private Address add;
	
	public void setId(int id)
	{
		this.id=id;
	}
    public int gteId()
    {
    	return id;
    }
    public void setAge(int age)
	{
		this.age=age;
	}
    public int gteAge()
    {
    	return age;
    }
    
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
	
	public void SetAdd(Address add)
	{
		this.add=add;
	}
	public Address getAdd()
	{
		return add;
	}

}
