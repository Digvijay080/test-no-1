package inheritance.parentandchild;

public class GrandFatherMain {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.setFn("Lalaso");
		c.setMn("Shanker");
		GrandFather.ln="Deshmukh";
		c.setFn1("Satish");
		c.setFn2("Digvijay");
		c.display();
		
		
	}

}
