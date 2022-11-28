package inheritance.containment1;

public class IdProof1Person1Main {

	public static void main(String[] args) {
		IdProof1 i=new IdProof1();
		i.setNumber(101);
		i.setName("Harsh");
		i.setAddress("Pune");
		
		Person1 p=new Person1();
		p.setName("Harsh");
		p.setAge(25);
		p.setId(i);
		
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getId());

	}

}
