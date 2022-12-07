package abstraction;

public class ElectronicsLaptopMain {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.setData(50000, "Black", "5.6 kg");
		l.display();
		l.rating();
		l.electricityConsumption();
		l.features();

	}

}
