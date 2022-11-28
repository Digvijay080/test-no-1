import java.util.Scanner;
public class ClassOfStudent {

	public static void main(String[] args) {
		int m;
		Scanner sc=new Scanner(System.in);
	
         System.out.println("enter marks : ");
         m=sc.nextInt();
         if (m>75)
         {
        	 System.out.println("Distinction");
         }
         else if(m>60){
        	 System.out.println("First class");
         }
         else if (m>55){
        	 System.out.println("Secound class");
         }
         else if(m>50)
         {
        	 System.out.println("higher class");
         }
         else if (m>35)
         {
        	 System.out.println("Pass class");
         }
         else
         {
        	 System.out.println("Fail");
        	 
         }
	
	}

}
