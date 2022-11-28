package assignment2;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		int sum=0,num,product=1;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number : ");
		 num=sc.nextInt();
		 
		 while(num!=0)
		 {
			 int r=num%10;
			 sum=sum+r;
			 product=product*r;
			 num=num/10;
		 }

		 System.out.println("Product of Digits : "+product);
		 

	}

}
