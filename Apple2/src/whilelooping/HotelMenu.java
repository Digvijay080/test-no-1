package whilelooping;
import java.util.Scanner;
public class HotelMenu {

	public static void main(String[] args) {
		char ch='n';
		Scanner sc = new Scanner(System.in);
		 do
	        {
			    
	        	System.out.println("1.Maharastrian Thali  250 \n2.Gujarati Thali      320 \n3.Rajestani Thali     210 \n4.Punjabi Thali       200");
	        	System.out.println("Enter your choice : ");
	        	int choice=sc.nextInt();
	        	System.out.println("enter quantity : ");
	        	int a=sc.nextInt();
	     
	        	
	        
	        	switch(choice)
	        	{
	        	case 1:
	        	       System.out.println("Your total bill is "+(a*250));
	        		   break;
	        	case 2:
	        	       
	        	       System.out.println("Your total bill is "+(a*320));
	 		           break;
	        	case 3:
	        	       System.out.println("Your total bill is "+(a*210));
	 		           break;       
	        	case 4:
	        	       System.out.println("Your total bill is "+(a*200));
	        	        break;
	        	default:
	        		System.out.println("Error...");
	        	}
	        	System.out.println("Enter do you want to continue (y/n)");
	        	ch=sc.next().charAt(0);
	        }
	        while (ch=='y'||ch=='Y');

	}

}
