import java.util.Scanner;
public class CelsiusIntoFahrenheit {
public static void main(String[] args) {
	 double c,f;
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("Enter temperature in celsius : ");
	c=sc.nextDouble();
	f = (c * 1.8) + 32;
	System.out.println("Fahrenheit : "+f);
	
}
}
