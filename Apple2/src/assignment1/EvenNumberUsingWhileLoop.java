package assignment1;

import java.util.Scanner;

public class EvenNumberUsingWhileLoop {

	public static void main(String[] args) {
		int start,end;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter start and end : ");
		   start=sc.nextInt();
		   end=sc.nextInt();
		   System.out.println("Even numbers are : ");
		   
		   while(end>=start)
		   {
		   if(start%2!=1)
		   
			   System.out.print(start+ "  ");
		   
		     start++;
		     
		   }
		   System.out.println("Done");

	}

}
