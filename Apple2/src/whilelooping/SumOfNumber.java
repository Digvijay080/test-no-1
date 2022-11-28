package whilelooping;
import java.util.Scanner;

public class SumOfNumber {
public static void main(String[] args) {
	int start,sum=0,end;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter start and end:");
	start=sc.nextInt();
	end=sc.nextInt();

	while(start<=end)
	{
		sum=start+sum;
		start++;
	}
	
	System.out.println("Addition is "+sum);
}
}
