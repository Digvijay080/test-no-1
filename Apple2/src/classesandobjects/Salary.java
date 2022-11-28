package classesandobjects;
import java.util.Scanner;
public class Salary {
	void pfsalary(int salary)
	{
	
		double  gsalary,pf=15;
		 gsalary=salary*(100-pf)*0.01;
		 System.out.println("Salary : Rs"+salary);
		 System.out.println("PF amount is: Rs"+ salary*pf*0.01);
		System.out.println("new salary : Rs"+ gsalary);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary :");
		int s=sc.nextInt();
		Salary s1=new Salary();
		s1.pfsalary(s);
		sc.close();

	}

}
