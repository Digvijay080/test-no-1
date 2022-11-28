package classesandobjects;
import java.util.Scanner;
public class Employee {
	int id;
	long contact;
	String name,dept;
	float salary;
	
	void setData(int i,String n,String d,float s,long c)
	{
		id=i;
		name=n;
		dept=d;
		salary=s;
		contact=c;
	}
	
	void display()
	{ 
		System.out.println(id+"  "+name+"  "+dept+"  "+salary+"  "+contact);
	}
	
	public static void main(String[] args) {
		int i;
		long c;
		String n,d;
		float s;
		Scanner sc=new Scanner(System.in);
		
		Employee e = new Employee();
		System.out.println("Enter id :");
		i=sc.nextInt();
		System.out.println("Enter name :");
		n=sc.next();
		System.out.println("Enter dept :");
		d=sc.next();
		System.out.println("Enter Salary :");
		s=sc.nextFloat();
		System.out.println("Enter contact :");
		c=sc.nextInt();
		e.setData(i, n, d, s, c);
		
		Employee e1 = new Employee();
		System.out.println("Enter id :");
		i=sc.nextInt();
		System.out.println("Enter name :");
		n=sc.next();
		System.out.println("Enter dept :");
		d=sc.next();
		System.out.println("Enter Salary :");
		s=sc.nextFloat();
		System.out.println("Enter contact :");
		c=sc.nextInt();
		e1.setData(i, n, d, s, c);
		
		Employee e2 = new Employee();
		System.out.println("Enter id :");
		i=sc.nextInt();
		System.out.println("Enter name :");
		n=sc.next();
		System.out.println("Enter dept :");
		d=sc.next();
		System.out.println("Enter Salary :");
		s=sc.nextFloat();
		System.out.println("Enter contact :");
		c=sc.nextInt();
		e2.setData(i, n, d, s, c);
		
		Employee e3 = new Employee();
		System.out.println("Enter id :");
		i=sc.nextInt();
		System.out.println("Enter name :");
		n=sc.next();
		System.out.println("Enter dept :");
		d=sc.next();
		System.out.println("Enter Salary :");
		s=sc.nextFloat();
		System.out.println("Enter contact :");
		c=sc.nextInt();
		e3.setData(i, n, d, s, c);
		
		Employee e4 = new Employee();
		System.out.println("Enter id :");
		i=sc.nextInt();
		System.out.println("Enter name :");
		n=sc.next();
		System.out.println("Enter dept :");
		d=sc.next();
		System.out.println("Enter Salary :");
		s=sc.nextFloat();
		System.out.println("Enter contact :");
		c=sc.nextInt();
		e4.setData(i, n, d, s, c);
		
		e.display();
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		
		sc.close();
	}

}
