package classesandobjects;
import java.util.Scanner;
public class Student2 {
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
		Student2 s1=new Student2();
		s1.id=101;                    // reference variables not recommended to use
		s1.name="Digvijay";
		s1.dept="Computer";
		s1.marks=70;
		
		
		/*Student2 s2=new Student2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id :");
		int id=sc.nextInt();
		System.out.println("Enter name :");    
		String n=sc.next();
		System.out.println("Enter dept :");
		String dept=sc.next();
		System.out.println("Enter marks");
		int m=sc.nextInt();
		s2.setData(id, n, dept, m);
		
		Student2 s3=new Student2();
		System.out.println("Enter id :");
		int id1=sc.nextInt();
		System.out.println("Enter name :");                                //1st method
		String n1=sc.next();
		System.out.println("Enter dept :");
		String dept1=sc.next();
		System.out.println("Enter marks");
		int m1=sc.nextInt();
		
		s3.setData(id1, n1, dept1, m1);
		
		
		Student2 s4=new Student2();
		System.out.println("Enter id :");
		int id2=sc.nextInt();
		System.out.println("Enter name :");    
		String n2=sc.next();
		System.out.println("Enter dept :");
		String dept2=sc.next();
		System.out.println("Enter marks");
		int m2=sc.nextInt();
		
		s4.setData(id2, n2, dept2, m2);*/
		int id,m;
		String n,dept;
		
		Student2 s2=new Student2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id :");
		 id=sc.nextInt();
		System.out.println("Enter name :");    
		 n=sc.next();
		System.out.println("Enter dept :");
		 dept=sc.next();
		System.out.println("Enter marks");
		 m=sc.nextInt();
		s2.setData(id, n, dept, m);
		
		Student2 s3=new Student2();
		System.out.println("Enter id :");
		 id=sc.nextInt();
		System.out.println("Enter name :");    
		 n=sc.next();
		System.out.println("Enter dept :");
		 dept=sc.next();
		System.out.println("Enter marks");
		 m=sc.nextInt();
		
		s3.setData(id, n, dept, m);
		
		
		Student2 s4=new Student2();
		System.out.println("Enter id :");
		 id=sc.nextInt();
		System.out.println("Enter name :");    
		n=sc.next();
		System.out.println("Enter dept :");
		dept=sc.next();
		System.out.println("Enter marks");
		 m=sc.nextInt();
		
		s4.setData(id, n, dept, m);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
