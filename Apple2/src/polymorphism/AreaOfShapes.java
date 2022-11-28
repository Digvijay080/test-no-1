package polymorphism;

public class AreaOfShapes {
	void area(double r)
	{
		System.out.println("Area of Circle is :"+(3.14*r*r));
	}
	void area(double l,double b)
	{
		System.out.println("Area of Rectangle :"+(l*b));
	}
    void area(double b,float h)
    {
    	System.out.println("Area of Triangel :"+(0.5*b*h));
    }
    void area(float r)
    {
    	System.out.println("Area of Square :"+(r*r));
    }
	public static void main(String[] args) {
		AreaOfShapes a1=new AreaOfShapes();
		a1.area(2.4);
		a1.area(2.3, 4.4);
		a1.area(5.2, 6.6f);
		a1.area(3.1f);
		

	}

}
