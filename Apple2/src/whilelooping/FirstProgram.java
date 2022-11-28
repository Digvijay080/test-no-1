
package whilelooping;
import java.util.Scanner;
public class FirstProgram {

	public static void main(String[] args) {
		int start,end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter End to Start: ");
		start=sc.nextInt();
		end=sc.nextInt();
		
		while (start<=end)
		{
			System.out.println(start+" ");
			start++;
			
		}
          System.out.println("Done");
	}

}
