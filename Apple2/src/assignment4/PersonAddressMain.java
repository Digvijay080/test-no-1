package assignment4;

public class PersonAddressMain {

	public static void main(String[] args) {
		Address a=new Address("Pune","Maharastra","India");
		
		
		Person p=new Person();
		p.setName("Harsh");
		p.setAge(25);
		p.setGender("Male");
		p.setAdd(a);
		
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender());
		System.out.println("Person's address :");
		System.out.println(p.getAdd());
		

	}

}
