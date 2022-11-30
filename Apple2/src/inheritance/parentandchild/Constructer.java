package inheritance.parentandchild;
class A
{ 
	A()
	{
		System.out.println("Inside  class A Constructer");
	}
	
}
class B extends A
{ 
	B()
	{
		System.out.println("Inside Class B Constructer");
	}
	B(int a)
	{
		System.out.println("Inside parameterize constructer");
	}
	
}

class C extends B
{ 
	C()
	{
		super(10);
		System.out.println("Inside Constructer");
	}
	
}



public class Constructer {
	public static void main(String[] args) {
		C c=new C();
	}

}
