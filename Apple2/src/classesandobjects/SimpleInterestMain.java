package classesandobjects;

import java.util.Scanner;

public class SimpleInterestMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter principle amount :");
		double a1=sc.nextDouble();
		
		System.out.println("Rate : ");
		double a2=sc.nextDouble();
		
		System.out.println("Time : ");
		double a3=sc.nextDouble();
		SimpleInterest s1= new SimpleInterest();
		s1.simplein(a1, a2, a3);
		
		sc.close();
		

	}

}
