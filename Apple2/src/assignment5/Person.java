package assignment5;

public class Person {
	int id;
    String name,contact,address;
	IdProof i;
	
	Person(int id,String name,String contact,String address,IdProof i)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.address=address;
		this.i=i;
	}
	public String toString()
	{
		return id+" "+name+" "+contact+" "+address+" "+i;
	}
}
