package assignment1;

import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {
	double l , b , p ;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Length : ");
	l=sc.nextDouble();
	
	System.out.println("Breadth : ");
	b=sc.nextDouble();
	
	p=2*(l+b);
	System.out.println("Perimeter of rectangle is "+p);
	}

}
