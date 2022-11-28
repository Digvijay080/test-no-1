package whilelooping;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int num,n=2,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		num=sc.nextInt();
		 
		  while (n<=num/2)
		  {
		   if (num%n==0)
		    sum++;
		    n++;
		  }
		  if (sum==0 )
		  {
		   System.out.print(num+ " is a prime number ");
		  } else {
		   System.out.print(num+ " is not a prime number ");
		  }

	}

}
