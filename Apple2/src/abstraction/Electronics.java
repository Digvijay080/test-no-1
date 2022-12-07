package abstraction;

public abstract class Electronics {
   int price;
   String colour,weight;
   
   void processor()
   {
	   System.out.println("Intel Processor");
   }
   
   void semiConductor()
   {
	   System.out.println("Silicon");
   }
   
   abstract void rating();
   abstract void electricityConsumption();
   abstract void features();
}
