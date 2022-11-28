package whilelooping;
import java.util.Scanner;
public class OddNumbers {
public static void main(String[] args) {
	int sum=0,num;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter number : ");
	 num=sc.nextInt();
	 
	 while(num!=0)
	 {
		 int r=num%10;
		 if(r%2==1)
		 {
			 sum=sum+r;
		 }
	
		 num=num/10;
	 }

	 System.out.println("Odd number : "+sum);
}
}
