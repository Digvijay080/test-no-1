import java.util.Scanner;
public class Diameter_CircumferenceAndAreaOfCircle {
public static void main(String[] args) {
	double r,d,c,area;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Radius of circle : ");
	r=sc.nextDouble();
	
	d=2*r;
	System.out.println("Diameter of circule is "+d);
	
	c=2*3.14*r;
	System.out.println("Circumference of circle is "+c);
	
	area=3.14*(r*r);
	System.out.println("Area of circle is "+area);
	
	
	
	
	
	
}
}
