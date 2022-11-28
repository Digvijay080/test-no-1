import java.util.Scanner;
public class ScanningNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number : ");
		num=sc.nextInt();
		
			 if(num%2==0 && num>0){
			    	System.out.println("even number and positive");
			    	
			    	
			    }
			    else
			    {
			    	System.out.println("odd number and negative");
			    }
		sc.close();
	}
	
	}


