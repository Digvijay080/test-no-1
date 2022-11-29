import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
	 double p,t,r,c;
	 Scanner sc = new Scanner(System.in);
		
		System.out.println("Principle amount : ");
		p=sc.nextDouble();
		
		System.out.println("Time : ");
		t=sc.nextDouble();
		
		System.out.println("Rate : ");
		r=sc.nextDouble();
		
		c =( p * (Math.pow ((1+r/100), t ) ));
		System.out.println("Compound Interest : "+c);

	}

}
