package whilelooping;
import java.util.Scanner;
public class MaximumMinimumNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		num=sc.nextInt();
		int max=num%10;
		int min=num%10;
		
		while(num!=0)
		{
			int r=num%10;
			
			if(r>max)
			{
				max=r;
			}
			if(r<min)
			{
				min=r;
			}
			num=num/10;
			
	
			
		}
              System.out.println("maximum number is "+max);
              System.out.println("Minimum number is "+min);
	}

}
