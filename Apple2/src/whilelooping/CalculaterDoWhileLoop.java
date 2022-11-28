package whilelooping;
import java.util.Scanner;
public class CalculaterDoWhileLoop {

	public static void main(String[] args) {
		char  ch='n';
		int a,b;
        Scanner sc= new Scanner(System.in);
        
        do
        {
        	System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Divison");
        	System.out.println("Enter your choice : ");
        	int choice=sc.nextInt();
        	System.out.println("enter numbers : ");
        	a=sc.nextInt();
        	b=sc.nextInt();
        	switch(choice)
        	{
        	case 1:System.out.println("Addition is "+(a+b));
        		   break;
        	case 2:System.out.println("Substraction is "+(a-b));
 		           break;
        	case 3:System.out.println("Multiplication is "+(a*b));
 		           break;       
        	case 4:System.out.println("Dividion is "+(a/b));
       		       break;
        	default:
        		System.out.println("Error...");
        	}
        	System.out.println("Enter do you want to continue (y/n)");
        	ch=sc.next().charAt(0);
        }
        while (ch=='y'||ch=='Y');
	}

}
