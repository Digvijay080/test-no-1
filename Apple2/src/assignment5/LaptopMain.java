package assignment5;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.setNoOfUSBPort(2);
		l.setProcessorSpeed(2);
		System.out.println(l.getNoOfUSBPort()+"\n"+l.getProcessorSpeed());

	}

}
