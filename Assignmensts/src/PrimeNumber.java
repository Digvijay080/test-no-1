import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		 int num , i = 1,b=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number :");
		 num=sc.nextInt();
		  
		    while (i <= num ) 
		    {
		     
		      if (num % i == 0)
		      {
		       b=b+1;
		        
		      }

		      ++i;
		      }

		    if (b==2)
	{
		    	System.out.println(num + " is a prime number."+b);
	}
		    else
		      {System.out.println(num + " is not a prime number."+b);
	}

	}

}
