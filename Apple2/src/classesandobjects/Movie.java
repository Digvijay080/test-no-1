package classesandobjects;
import java.util.Scanner;
public class Movie {
	void movie()
	{
		
		Scanner sc=new Scanner(System.in);
	         System.out.println("Enter id :");
			 int i=sc.nextInt();
			System.out.println("Enter name :");    
			String n=sc.next();
			System.out.println("Enter year of relese :");
			 int y=sc.nextInt();
			System.out.println("Enter Producer name :");
			String p=sc.next();
			System.out.println(i+" "+n+" "+y+" "+p);
			
			sc.close();
		}
	
    
	public static void main(String[] args) {
		Movie m=new Movie();
		m.movie();
		Movie m2=new Movie();
		m2.movie();
		

	}

}
