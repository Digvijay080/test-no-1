package inheritance.containment;

public class PersonAddressMain {

	public static void main(String[] args) {
		Address a1=new Address();
		a1.setArea("Campus");
		a1.setCity("Pune");
		a1.setState("Maharastra");
		a1.setPincode("415041");
		
		Person p1=new Person();
		p1.setName("Harsh");
		p1.setContact("7040303535");
		p1.SetAdd(a1);
		
		//System.out.println(p1.getName()+" "+p1.getContact()+" "+p1.getAdd());
		System.out.println("Name :"+p1.getName()+"\nContact :"+p1.getContact());
        System.out.println("Adress :");
        System.out.println("Area :"+p1.getAdd().getArea());
        System.out.println("City :"+p1.getAdd().getCity());
        System.out.println("State :"+p1.getAdd().getState());
        System.out.println("Pincode :"+p1.getAdd().getPincode());
        
	
	
	
	}

}
