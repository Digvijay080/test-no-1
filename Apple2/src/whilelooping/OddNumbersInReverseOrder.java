package whilelooping;

import java.util.Scanner;

public class OddNumbersInReverseOrder {

	public static void main(String[] args) {
	   int start,end;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter start and end : ");
	   start=sc.nextInt();
	   end=sc.nextInt();
	   
	   while(end>=start)
	   {
	   if(end%2!=0)
	   
		   System.out.println(end+"");
	   
	     end--;
	     
	   }
	   System.out.println("Done");
	   
	   sc.close();
	   
	   
	
	}
	}

