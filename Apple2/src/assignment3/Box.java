package assignment3;
import java.util.Scanner;
public class Box {
	void volume(double l,double w,double h)
	{
		double vol=l*w*h;
		System.out.println("Volume of box :"+vol);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length :");
		double l=sc.nextDouble();
		System.out.println("Enter width :");
		double w=sc.nextDouble();
		System.out.println("Enter height :");
		double h=sc.nextDouble();
		
		Box b=new Box();
		b.volume(l, w, h);
		
		sc.close();

	}

}
