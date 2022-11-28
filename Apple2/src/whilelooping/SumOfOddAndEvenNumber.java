package whilelooping;
import java.util.Scanner;
public class SumOfOddAndEvenNumber {
	public static void main(String[] args) {
		
	
	int start,sum=0,end,sum1=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter start and end:");
	start=sc.nextInt();
	end=sc.nextInt();

	while(start<=end)
	{
		if(start%2==0)
		{
		sum=start+sum;
		}
		else{
			sum1=sum1+start;
		}
		start++;
	}
	System.out.println("Addition of even number is "+sum);
	System.out.println("Addition of odd number is "+sum1);
	
	sc.close();
	
	
}
	
}