package classesandobjects;
import java.util.Scanner;
public class CarUsingThis {
	int id,launchyear;
	String company,name;
	double price;
	void car1(int id,String name,String company,double price,int launchyear)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
		this.launchyear=launchyear;
	}
	

	public String toString()
	{
		return id+" "+name+" "+company+" "+price+" "+launchyear;
	}

	public static void main(String[] args) {
	int i,l;
	String c,n;
	double p;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id :");
	i=sc.nextInt();
	System.out.println("Enter name :");
	n=sc.next();
	System.out.println("Enter company :");
	c=sc.next();
	System.out.println("Enter price :");
	p=sc.nextDouble();
	System.out.println("enter Launch year :");
	l=sc.nextInt();
	
	CarUsingThis c1=new CarUsingThis();
	c1.car1(i, n, c, p, l);
	System.out.println(c1);
	
	System.out.println("Enter id :");
	i=sc.nextInt();
	System.out.println("Enter name :");
	n=sc.next();
	System.out.println("Enter company :");
	c=sc.next();
	System.out.println("Enter price :");
	p=sc.nextDouble();
	System.out.println("enter Launch year :");
	l=sc.nextInt();
	CarUsingThis c2=new CarUsingThis();
	c2.car1(i, n, c, p, l);
	System.out.println(c2);
	
	sc.close();
	
	
	

	}

}
