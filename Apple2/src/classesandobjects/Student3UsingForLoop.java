package classesandobjects;
import java.util.Scanner;
public class Student3UsingForLoop {
	int id,marks;
	String name ,dept;
	
	void setData(int i,String n,String d,int m )
	{
		id=i;
		name=n;
		dept=d;
		marks=m;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks);
	}
	public static void main(String[] args) {
		int id,m;
		String n,dept;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of students :");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println("Enter data for "+i+" student");
			System.out.println("Enter id :");
			id=sc.nextInt();
			System.out.println("Enter name :");    
			 n=sc.next();
			System.out.println("Enter dept :");
			 dept=sc.next();
			System.out.println("Enter marks");
			 m=sc.nextInt();
			 Student3UsingForLoop s=new Student3UsingForLoop();
			s.setData(id, n, dept, m);
			s.display();
		}
		
		sc.close();
	}

}
