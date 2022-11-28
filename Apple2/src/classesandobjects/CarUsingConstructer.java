package classesandobjects;

public class CarUsingConstructer {
	int id,launchyear;
	String company,name;
	double price;
	CarUsingConstructer()
	{
		id=-1;
		name="nnnnnn";
		company="yyyyyy";
		price=-0.1;
		launchyear=-1;
	}
	
	void show()
	{
		int a=0,b=0;
		System.out.println(a+" "+b);
		System.out.println(id+" "+name);
	}
	
	public String toString()
	{
		return id+" "+name+" "+company+" "+price+" "+launchyear;
	}
	public static void main(String[] args) {
		CarUsingConstructer c=new CarUsingConstructer();
		System.out.println(c);
		
	    
		CarUsingConstructer c1=new CarUsingConstructer();
        System.out.println(c1);
		
		
		
		

	}

}
