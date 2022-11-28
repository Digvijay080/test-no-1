package staticvariables;

public class EmployeeMain {
    static int a;           //Static variable
    /*static
    {
    	a=100;
    	System.out.println("Static block 1");
    }
    static
    {
    	
    	System.out.println("Static block 2 :"+a);   Static blocks : 
    	                                               Access and initialize only staic variable
    }
    static
    {
    	
    	System.out.println("Static block 3");
    }*/
    

	public static void main(String[] args) {
         Employee.auditorium();
       // System.out.println(Employee.compname);  
		Employee e=new Employee(101,"Harsh","IT",60000);
		Employee e1=new Employee(101,"Onkar","Software",65000);
		Employee e2=new Employee(101,"Ajay","Mac",50000);
		
		System.out.println(e.name+" "+Employee.compname);
	    e.display();
	
	}

}
