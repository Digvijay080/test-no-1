package constructers;
import java.util.Scanner;
public class Theater {
	int id;
	double rating;
	String name,address,contact;
	Theater(int id,String name,String address,double rating,String contact)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.rating=rating;
		this.contact=contact;
		
	}
public String toString()
{
	return id+" "+name+" "+address+" "+rating+" "+contact;
}
	public static void main(String[] args) {
		int id;
		double rating;
		String name,address,contact;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter count :");
         int c=sc.nextInt();
         
         for(int i=1;i<=c;i++)
         {
        	 System.out.println("Theater no:"+i);
        	System.out.println("Enter id :");
     		id=sc.nextInt();
     		System.out.println("Enter name :");
     		name=sc.next();
     		System.out.println("Enter address :");
     		address=sc.next();
     		System.out.println("Enter rating :");
     		rating=sc.nextDouble();
     		System.out.println("Enter contact :");
     		contact=sc.next();
     		Theater t=new Theater(id,name,address,rating,contact);
            System.out.println(t);
     		
     		}
         sc.close();
         
	}

}
