package inheritance.containment;

public class EngineCarGetSetMain {

	public static void main(String[] args) {
		EngineSetAndGet e1=new EngineSetAndGet();
	     
	     e1.setPower(1000);
	     e1.setTorque(5);
	     e1.setCompany("Tata");
	     
	     CarSetAndGet c1=new CarSetAndGet();
	     c1.setId(1001);
	     c1.setName("Nexon");
	     c1.setCname("Tata");
	     c1.setPrice(800000);
	     c1.setEng(e1);
	     
        EngineSetAndGet e2=new EngineSetAndGet();
	     
	     e2.setPower(1000);
	     e2.setTorque(5);
	     e2.setCompany("Tata");
	     
	     CarSetAndGet c2=new CarSetAndGet();
	     c2.setId(1001);
	     c2.setName("Fortuner");
	     c2.setCname("Toyota");
	     c2.setPrice(4500000);
	     c2.setEng(e2);
	     
	    System.out.println(c1.gteId()+" "+c1.getCname()+" "+c1.getCname()+" "+c1.getEng());
	    System.out.println(c2.gteId()+" "+c2.getCname()+" "+c2.getCname()+" "+c2.getEng());
	   
	    /*System.out.println(c1.getName()+" "+c1.gtePrice()+" "+c1.getName());

	    System.out.println("\nEngine Details: ");

	    System.out.println("Engine Company: "+c1.getEng().getConpany());

	    System.out.println("Power: "+c1.getEng().getPower()+"watt");
	    System.out.println("Torque: "+c1.getEng().getTorque()+"16");*/
	}

}
