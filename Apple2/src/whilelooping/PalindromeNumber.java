package whilelooping;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number : ");
		 num=sc.nextInt();
		temp=num;
		 while(num>0)
		 {
			 int r=num%10;
			 sum=(sum*10)+r;
			 num=num/10;
		 }
			 if(temp==sum) 
			 {
				   System.out.println(" palindrome number ");
			 }
		     else    
		     {	   
		    	   System.out.println(" not palindrome"); 
		     
		     
		 }
		 }
}
