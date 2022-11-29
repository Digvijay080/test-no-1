import java.util.Scanner;
public class SimpleInterest {
public static void main(String[] args) {
	double p,t,r,s;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Principle amount : ");
	p=sc.nextDouble();
	
	System.out.println("Time : ");
	t=sc.nextDouble();
	
	System.out.println("Rate : ");
	r=sc.nextDouble();
	 
	s=(p*t*r)/100;
	System.out.println("Simple interest : "+s);
	
}
}
