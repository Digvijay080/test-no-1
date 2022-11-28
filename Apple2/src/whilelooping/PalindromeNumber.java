package whilelooping;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number : ");
		 num=sc.nextInt();
		 while(num>0)
		 {
			 int r=num%10;
			 sum=(sum*10)+r;
			 num=num/10;
		 }
			 if(num==sum) 
			 {
				   System.out.println(" palindrome number ");
			 }
		     else    
		     {	   
		    	   System.out.println(" not palindrome"); 
		     
		     
		 }
		 }
}
