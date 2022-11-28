package constructers;

public class PersonAddressMain {

	public static void main(String[] args) {
		Address a1=new Address("Campus","Pune","Maharastra","415110");
		
		Person p1=new Person(1001,"Harsh","7040303535",24,a1);
		System.out.println(p1);
		
		
	}

}
