package inheritance.containment;

public class Car {
	int id,price;
	String cname,name;
	Engine e;
	
	Car(int id,String name,String cname,int price,Engine e)
	{
		this.id=id;
		this.name=name;
		this.cname=cname;
		this.price=price;
		this.e=e;
		
	}
	public String toString()
	{
		return name+" "+cname+" "+price+"\n"+e;
	}

}
