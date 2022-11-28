package whilelooping;

import java.util.Scanner;

public class EvenNumberUsingWhileLoop {

	public static void main(String[] args) {
		int num,a;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number  : ");
		 num=sc.nextInt();
		 a=2;
		 
		 while(a<num)
		 {
			System.out.println(a+"");
			a=a+2;
		 }

		 System.out.println("even number : "+a);


	}

}
