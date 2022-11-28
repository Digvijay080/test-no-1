package inheritance.containment1;

public class Person {
	String name,contact;
	int age;
	IdProof id;
	
	Person(String name,int age,IdProof id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
public String toString()
{
	return name+" "+age+" "+id;
}
}
