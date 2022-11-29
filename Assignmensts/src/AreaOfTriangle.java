import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		float b,h,area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base of triangle : ");
		b=sc.nextFloat();
		
		System.out.println("Height of triangle : ");
		h=sc.nextFloat();
		 
		area=0.5f*b*h;
		System.out.println("Area of Triangle is  "+area);

	}

}
