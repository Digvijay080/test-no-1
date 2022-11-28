package classesandobjects;
import java.util.Scanner;
public class Calculator {
void addition()
{
	Scanner sc= new Scanner(System.in);	
	System.out.println("Enter two numbers : ");
   int a=sc.nextInt();
    int b=sc.nextInt();
   System.out.println("Addition is "+(a+b));
}
void substraction()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers : ");
   int a=sc.nextInt();
   int b=sc.nextInt();
   System.out.println("Substraction is "+(a-b));
}
void multiplication()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers : ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Multiplication is "+(a*b));
}
void division()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers : ");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    System.out.println("Division is "+(a/b));
    sc.close();
}
void square()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number : ");
    int a=sc.nextInt();
   System.out.println("Square is "+(a*a));
   sc.close();
}
void squareRoot()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number : ");
    int a=sc.nextInt();
	System.out.println("Square root is"+Math.sqrt(a));
	sc.close();
}
	public static void main(String[] args) {
		
		
		

	}

}
