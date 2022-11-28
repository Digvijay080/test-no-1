 package assignment1;
import java.util.Scanner;
public class OddNumbersUsingWhileLoop {

	public static void main(String[] args) {
		int start,end;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter start and end : ");
		   start=sc.nextInt();
		   end=sc.nextInt();
		   
		   while(end<=start)
		   {
		   if(start%2!=0)
		   
			   System.out.print(start+"  ");
		   
		     start--;
		     
		   }
		   System.out.println("Done");
		   
	}

}
