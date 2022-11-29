import java.util.Scanner;
public class DaysIntoYears_Weeks {
public static void main(String[] args) {
	float d,y,w;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Days : ");
	d=sc.nextFloat();
	w=d/7;
	System.out.println("Weeks : "+w);
	y=d/365;
	System.out.println("Years : "+y);
	
	
}
}
