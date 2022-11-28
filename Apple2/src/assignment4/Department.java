package assignment4;

public class Department {
	int id;
	String dep;
	
	Department(int id,String dep)
	{
		this.dep=dep;
		this.id=id;
	}
	
	public String toString()
	{
		return "ID :"+id+"\nDepartment :"+dep;
	}
	

}
