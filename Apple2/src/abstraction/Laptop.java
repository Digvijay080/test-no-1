package abstraction;

public class Laptop extends Electronics {
	void setData(int price,String colour,String weight)
	{
		this.colour=colour;
		this.price=price;
		this.weight=weight;
	}
	
	void display()
	{
		System.out.println(colour+" "+price+" "+weight);
	}
	
	void rating()
	{
		System.out.println("Rating= 9.4");
	}
	void electricityConsumption()
	{
		System.out.println("25 walt");
	}
	void features()
	{
		System.out.println("3D laptop");
	}

}
