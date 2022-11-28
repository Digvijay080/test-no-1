package inheritance.parentandchild;

public class CarAudiMain {
	public static void main(String[] args) {
		AudiQ8 a=new AudiQ8();
		a.setPrice("1.4 cr");
		a.setEngine("V8 turbo engine");
		a.wheelNo();
		a.headLights();
		a.seatWarmer();
		a.autoWiper();
		System.out.println(a.getPrice()+" "+a.getEngine());
	}

}
