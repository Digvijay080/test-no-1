package classesandobjects;
import java.util.Scanner;
public class Movie1 {
	int id,yearrelease;
	String name,producer;
void movie1(int i,String n,int y,String p)

{
	id=i;
	name=n;
	yearrelease=y;
	producer=p;
		
}
public String toString()
{
	return id+" "+name+" "+yearrelease+" "+producer;
}
	public static void main(String[] args) {
		int i,y;
		String n,p;
		Scanner sc=new Scanner(System.in);
		
		for(int j=1;j<=2;j++)
		{
			System.out.println("Enter id :");
			  i=sc.nextInt();
			System.out.println("Enter name :");    
			n=sc.next();
			System.out.println("Enter year of relese :");
			 y=sc.nextInt();
			System.out.println("Enter Producer name :");
			p=sc.next();
			Movie1 m=new Movie1();
			m.movie1(i, n, y, p);
			System.out.println(m);
		}
		
		sc.close();
	}

}
