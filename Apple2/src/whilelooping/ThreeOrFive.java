package whilelooping;

import java.util.Scanner;

public class ThreeOrFive {

	public static void main(String[] args) {
		int start,end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start and end:");
		start=sc.nextInt();
		end=sc.nextInt();
		
		while (start<=end)
		{
			if(start%3==0 || start%5==0)
			{
				System.out.print(start+" ");
			}
			
			start++;
		}
		
          System.out.println("Done");

}
}

