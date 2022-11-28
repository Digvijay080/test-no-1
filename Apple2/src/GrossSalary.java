import java .util.Scanner;
public class GrossSalary {
 public static void main (String []args){
	 double basic=20000.50,hr,da,gross;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter basic salary : ");
	 basic=sc.nextDouble();
	 
	 if(basic<=10000)
	 {
		 hr=basic*0.2;
		 da=basic*0.8;
	 }
	 else if (basic<=20000)
	 {
	     hr=basic*0.25;
	     da=basic*0.9;
	 }
	 else 
	 {
	     hr=basic*0.3;
	     da=basic*0.95;		 
	 }
	 gross=basic+hr+da;
	 System.out.println("Gross salary is : "+gross);
	 }
	 
 
}
