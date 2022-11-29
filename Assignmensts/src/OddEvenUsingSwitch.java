import java.util.Scanner;
public class OddEvenUsingSwitch {

	public static void main(String[] args) {
		int a;
	    Scanner scan=new Scanner(System.in); 
			
		System.out.print("Enter the  number: ");
		a=scan.nextInt();
		
		switch(a%2)
		{
		
		case 0:
		    System.out.println(" Even number");
		    break;
		case 1:
		    System.out.println(" Odd number");

	}

}
}