package inheritance.containment;

public class CarEngineMain {

	public static void main(String[] args) {
       Engine e1=new Engine(1000,5,"tata");
       Car c1=new Car(1001,"Nexon","Tata",800000,e1);
       
       Engine e2=new Engine(1000,5,"tata");
       Car c2=new Car(1001,"Accord","Honda",700000,e2);
       
       
       Engine e3=new Engine(1000,5,"tata");
       Car c3=new Car(1001,"Fortuner","Toyota",800000,e3);
       
       
      System.out.println(c1);
      System.out.println("--------******-------");
      System.out.println(c2);
      System.out.println("--------******-------");
      System.out.println(c3);

	}

}
