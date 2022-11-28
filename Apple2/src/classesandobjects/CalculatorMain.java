package classesandobjects;
import java.util.Scanner;
public class CalculatorMain {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division \n5.Square \n6.Square root");
	     System.out.println("Enter your choice : ");
	     int ch=sc.nextInt();
	     Calculator c1=new Calculator();
	     
	     switch(ch)
	     {
	     case 1 : c1.addition();
	              break;
	     case 2 : c1.substraction();
	              break;
	     case 3 : c1.multiplication();
                  break;
	     case 4 : c1.division();
                  break;
	     case 5 : c1.square();
                  break;
	     case 6 : c1.squareRoot();
                  break;
         default:
        	    System.out.println("Enter valid number ...!!!");
	     }
	     sc.close();
	}

}
