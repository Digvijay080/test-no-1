import java.util.Scanner;


public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a,b,c,d;
          
          Scanner sc = new Scanner(System.in);
          System.out.println("first number : ");
          a=sc.nextInt();
          
          System.out.println("secound number : ");
          b=sc.nextInt();
          
          System.out.println("third number : ");
          c=sc.nextInt();
          
          System.out.println("fourth number : ");
          d=sc.nextInt();
          
          if(a>=b && a>=c && a>=d)
          {
        	  System.out.println(a+" is greatest");
          }
          else if(b>=a && b>=c && b>=d)
          {
        	  System.out.println(b+" is greatest");
          }
          else if(c>=a && c>=b && c>=d)
          {
        	  System.out.println(c+" is greatest");
          }
          else 
          {
        	  System.out.println(d+" i gretest");
        	  
          }
          
          sc.close();
	}

}
