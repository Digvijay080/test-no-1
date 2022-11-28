package classesandobjects;

import java.util.Scanner;

public class HikeSalaryMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary :");
		int s=sc.nextInt();
		HikeSalary p1=new HikeSalary();
		float newSalary=p1.hike(s, 'A');
		p1.pfcalculate(newSalary);
		System.out.println();
		
		System.out.println("------*******------");
		System.out.println("Enter Salary :");
		int s1=sc.nextInt();
		HikeSalary p2=new HikeSalary();
		 newSalary=p2.hike(s1, 'A');
		 p2.pfcalculate(newSalary);
		 System.out.println();
		 
		 System.out.println("------*******------");
		 System.out.println("Enter Salary :");
			int s2=sc.nextInt();
		 HikeSalary p3=new HikeSalary();
		 newSalary=p3.hike(s2, 'A');
		 p3.pfcalculate(newSalary);
		 System.out.println();
		
		 sc.close();
	}

}
