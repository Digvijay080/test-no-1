package assignment5;

public class IdProofPersonMain {

	public static void main(String[] args) {
		IdProof i=new IdProof("Adhaar card",785695436,2029 );
		Person p=new Person(101,"Harsh","9404656564","Pune",i);
        System.out.println(p);
	}

}
