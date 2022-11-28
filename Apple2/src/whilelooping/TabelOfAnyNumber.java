package whilelooping;

import java.util.Scanner;

public class TabelOfAnyNumber {

	public static void main(String[] args) {
		int num,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		
		while(i<=10)
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}

	}

}
