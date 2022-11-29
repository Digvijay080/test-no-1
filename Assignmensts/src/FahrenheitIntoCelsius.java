import java.util.Scanner;
public class FahrenheitIntoCelsius {

	public static void main(String[] args) {
		
		double f,c;
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter temperature in Fahrenheit : ");
		f=sc.nextDouble();
		
		 c = (f-32)*(0.5556);
		System.out.println("Celsius : "+c+"°C");
		
		
		
	

	}

}
