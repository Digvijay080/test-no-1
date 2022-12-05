package inheritance.parentandchild;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.test();
		
		f=new Apple();
		f.test();
		
		f=new Strawberry();
		f.test();
	}

}
