package constructers;

public class ConstructerChaining {
	ConstructerChaining()
	{ 
		this(10);
		System.out.println("Inside simple constructer");
	}
	ConstructerChaining(int x)
	{
		this(10,20);
		System.out.println("Inside 1 parameter constructer");
	}
	ConstructerChaining(int x,int y)
	{
		this("ABC");
		System.out.println("Inside 2 parameter constructer");
	}
	ConstructerChaining(String z)
	{
		System.out.println("Inside String parameter constructer");
	}
public static void main(String[] args) {
	
}
}
