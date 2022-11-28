package whilelooping;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		int i,b,e;
		long power=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value : ");
		b=sc.nextInt();
		System.out.println("Enter the exponent value : ");
		e=sc.nextInt();
		
		for(i=1;i<=e;i++)
		{
			power=power*b;
		}
         System.out.println(b+" to the power "+e+" is "+power);
	}

}
