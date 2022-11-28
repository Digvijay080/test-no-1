package assignment3;
import java.util.Scanner;

public class CountrysNationalGame {

	public static void main(String[] args) {
	String country;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Country name : ");
	country=sc.next();
	
	switch(country)
	{
	
	case "India" :System.out.println("National game is Hocky");
	              break;
	case "China" :System.out.println("National game is Tennis");
	              break;
	case "Bangladesh":System.out.println("National game is Kabaddi");              
	              break;
	case "Italy" :System.out.println("National game is Football");             
                  break;
	case "United States":System.out.println("National game is Baseball");
	              break;
	 default:
		 System.out.println("Enter valid country name .....!!!!");
	
	}
	sc.close();

	}

}
