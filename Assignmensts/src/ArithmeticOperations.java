import java.util.Scanner;
public class ArithmeticOperations {
  public static void main(String args[])
  {
	int a,b,c;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("First number : ");
	a=sc.nextInt();
	
	System.out.println("Secound number : ");
	b=sc.nextInt();
	
	c=a+b;
	System.out.println("Addition  : "+c);
	
	c=a-b;
	System.out.println("Substraction : "+c);
	
	c=a*b;
	System.out.println("Multiplication : "+c);
	
	c=a/b;
	System.out.println("Division : "+c);
	
	c=a%b;
	System.out.println("Modulos : "+c);
	
	
	

  
  
  
  
  
  
  }
}