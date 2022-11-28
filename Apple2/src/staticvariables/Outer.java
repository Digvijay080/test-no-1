package staticvariables;

public class Outer {
	int a=100;
	static int b=200;
	
	void display()            //non-static can access static as well as non-static directly
	{
		System.out.println(a+" "+b);
	}
	
	
   static                                       //static can access only static directly
   {
	   System.out.println(b);                   
	   Outer o=new Outer();                    //to display non-static it require an object
	   System.out.println(o.a);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
