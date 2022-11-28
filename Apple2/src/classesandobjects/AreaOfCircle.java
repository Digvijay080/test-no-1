package classesandobjects;
import java.util.Scanner;
public class AreaOfCircle {
	float radiussqu(float r)
	{
		float sq=r*r;
		return sq;
	}
void area(float sq)
{
	double area=3.14*sq;
	System.out.println("Area of circle :"+area);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius :");
		float s=sc.nextFloat();
		AreaOfCircle a1=new AreaOfCircle();
		float areaof=a1.radiussqu(s);
		a1.area(areaof);
		
		
		sc.close();
		

	}

}
