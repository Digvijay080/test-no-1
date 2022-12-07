package abstraction;

public abstract class SwiftAbstract extends Car1{
	void setData(String engine,int price)
	{
		this.engine=engine;
		this.price=price;
	}
	void displayInfo()
	{
		System.out.println(price+" "+engine);
	}
	void dashboard()
	{
		System.out.println("Swift has :Ac, Music System");
	}
	void saftyfeatures()
	{
		System.out.println("Swift has : Air bags, Child lock");
	}
	void buildQuality()
	{
		System.out.println("swift :3 Star rated");
	}


}
