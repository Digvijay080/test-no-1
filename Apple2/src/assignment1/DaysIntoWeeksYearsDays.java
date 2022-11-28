package assignment1;

import java.util.Scanner;

public class DaysIntoWeeksYearsDays {

	public static void main(String[] args) {
		float d,y,w,days;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Days : ");
		d=sc.nextFloat();
		w=d/7;
		System.out.println("Weeks : "+w);
		y=d/365;
		System.out.println("Years : "+y);
		days=d;
		System.out.println("Days : "+days);

	}

}
