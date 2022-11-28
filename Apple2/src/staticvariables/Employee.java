package staticvariables;

public class Employee {
	int id ,salary;
	String name,dept;
	static String compname="Infosys";
	
	static void auditorium ()
	{
		System.out.println("Auditorium is common for all employee");
	}
	
	void display()
	{
		System.out.println("inside display method...");
	}
	
	
	
	Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
public String toString()
{
	return id+" "+name+" "+dept+" "+salary;
}
public static void main(String[] args) {
	auditorium();                //static can access only static directly
	
	
}
}
