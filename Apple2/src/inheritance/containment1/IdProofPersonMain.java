package inheritance.containment1;

public class IdProofPersonMain {

	public static void main(String[] args) {
		IdProof i=new IdProof(101,"Harsh","pune");
		Person p=new Person("Harsh",25,i);
         System.out.println(p);
	}

}
