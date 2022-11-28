package assignment4;

public class Student {
	int roll;
	String name;
	Department dep;
	
	Student(String name,int roll,Department dep)
	{
		this.name=name;
		this.roll=roll;
		this.dep=dep;
	}
public String toString()
{
	return  "Student :"+name+"\nRoll no :"+roll+"\nDepartment :"+dep;
}
}
