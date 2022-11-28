package encapsulation;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c1=new Customer();
		
		c1.setAccno(1001);
		c1.setName("Harsh");
		c1.setContact("9735620172");
		c1.setEmail("Haresh080@emil.com");
		c1.setBalance(400000);
		
		System.out.println(c1.getAccno()+" "+c1.getName()+" "+c1.getContact()+" "+c1.getEmail()+" "+c1.getbalance());
		
        Customer c2=new Customer();
		
		c2.setAccno(1001);
		c2.setName("Onkar");
		c2.setContact("9583220172");
		c2.setEmail("Onkar090@emil.com");
		c2.setBalance(700000);
		
		System.out.println(c2.getAccno()+" "+c2.getName()+" "+c2.getContact()+" "+c2.getEmail()+" "+c2.getbalance());
        
		c1.setContact("70403066765");
		c2.setEmail("Onkar0009@email.com");
		System.out.println(c1.getAccno()+" "+c1.getName()+" "+c1.getContact()+" "+c1.getEmail()+" "+c1.getbalance());
		System.out.println(c2.getAccno()+" "+c2.getName()+" "+c2.getContact()+" "+c2.getEmail()+" "+c2.getbalance());
	}

}
