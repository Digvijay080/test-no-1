package whilelooping;
import java.util.Scanner;
public class FactorialUsingWhileLoop {

	public static void main(String[] args) {
		 int a,n=1; 
	        Scanner sc = new Scanner(System.in);   
	        System.out.println("Enter a number : ");  
	        a = sc.nextInt();  
	        System.out.println("Factor of"+n+"are: ");
	       
	        while( n <= a)
	        {    
	            ++n;  
	            if(a%n==0)
	            	System.out.print(n+"");
	        }     
	  
	       
	    

	}

}
