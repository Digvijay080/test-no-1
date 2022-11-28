package inheritance.parentandchild;

public class FatherDaughterSonMain {

	public static void main(String[] args) {
		Son s=new Son();
		s.setName("Harsh");
		s.setAge(30);
		
		System.out.println("Son's information :");
		System.out.println(s.getName()+" "+s.getAge());
		s.education();
		s.address();
		
		Daughter d=new Daughter();
		d.setName("Pooja");
		d.setAge(20);
		System.out.println();
		System.out.println("Daughter's information :");
		System.out.println(d.getName()+" "+d.getAge());
		d.education();
		d.address();

	}

}
