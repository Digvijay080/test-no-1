package abstraction;

public abstract class Car1 {
	int price;
	String engine;
	
	void wheelNo()
	{
		System.out.println("Every car has 4 wheels");
	}
   void headLight()
   {
	   System.out.println("There are 2 Headlights");
   }
   
   abstract void dashboard();
   abstract void saftyfeatures();
   abstract void buildQuality();
   abstract void allowyWheels();

}
