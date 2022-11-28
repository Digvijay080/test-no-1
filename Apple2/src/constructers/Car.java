package constructers;
import java.util.Scanner;
public class Car {
	int id,price;
	String name,company;
	Car(int id,String name,String company,int price)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
	}
public String toString()
{
	return id+" "+name+" "+company+" "+price;
}
	public static void main(String[] args) {
		int id,price;
		String name,company;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id :");
		id=sc.nextInt();
		System.out.println("Enter name :");
		name=sc.next();
		System.out.println("Enter company :");
		company=sc.next();
		System.out.println("Enter price :");
		price=sc.nextInt();
		
		Car c=new Car(id,name,company,price);
		System.out.println(c);
		
		
		System.out.println("Enter id :");
		id=sc.nextInt();
		System.out.println("Enter name :");
		name=sc.next();
		System.out.println("Enter company :");
		company=sc.next();
		System.out.println("Enter price :");
		price=sc.nextInt();
		
		Car c1=new Car(id,name,company,price);
		System.out.println(c1);


	}

}
