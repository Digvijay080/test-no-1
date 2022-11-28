package encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee();
		
		e1.setId(101);
		e1.setName("Harsh");
		e1.setDept("HR");
		e1.setSalary(500000);
		e1.setEmail("Harsh01@gmail.com");
		
        Employee e2=new Employee();
		
		e2.setId(102);
		e2.setName("Onkar");
		e2.setDept("Software Engineer");
		e2.setSalary(400000);
		e2.setEmail("Onkar010@gmail.com");
		
		System.out.println(e1.getId()+" "+e1.getDept());
		System.out.println(e2.getId()+" "+e2.getSalary());
		
        e1.setDept("Casher");
        System.out.println(e1.getId()+" "+e1.getDept());
        
		

	}

}
