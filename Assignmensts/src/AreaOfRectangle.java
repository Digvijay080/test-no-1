import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		double l,b,area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Length : ");
		l=sc.nextDouble();
		
		System.out.println("Breadth : ");
		b=sc.nextDouble();
		
		area = l*b;
		System.out.println("Area of rectangle : "+area);
		

	}

}
