package whilelooping;
import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		int sum=0,num;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number : ");
		 num=sc.nextInt();
		 
		 while(num!=0)
		 {
			 int r=num%10;
			 if(r%2==0)
			 {
				 sum=sum+r;
			 }
		
			 num=num/10;
		 }

		 System.out.println("even number : "+sum);

	}

}
