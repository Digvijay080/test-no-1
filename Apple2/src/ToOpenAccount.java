import java.util.Scanner;
public class ToOpenAccount {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter person age : ");
		 a =sc.nextInt();
		
		if (a>=18 )
		{
			System.out.println("Allow person to open account");
		}
		else
		{
		    System.out.println("Not allow to open account");
		}
		}
	}


