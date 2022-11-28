package whilelooping;
import java.util.Scanner;
public class ReverseNumberDoWhileLoop {

	public static void main(String[] args) {
		int num,rev;
		char ch='n';
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter number : ");
			num=sc.nextInt();
			rev=0;
			while(num>0)
	          {
	        	  int r=num%10;
	        	  rev=rev*10+r;
	        	  num=num/10;
	          }
	          System.out.println("Reverse number is : "+rev);
	          System.out.println("Do you want to continue( y/n)");
	          ch=sc.next().charAt(0);
			
		}
		while (ch=='Y' || ch=='y');
          
	}

}
