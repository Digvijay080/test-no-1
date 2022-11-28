import java.util.Scanner;
 
public class AverageOfFiveNumber {
 
 public static void main(String[] args) {
  
	 Scanner sc = new Scanner(System.in);
   float s1,s2,s3,s4,s5,average;
  System.out.print("first number: ");
  s1 = sc.nextFloat();
  System.out.print("second number: ");
  s2 = sc.nextFloat();
   System.out.print("third number: ");
  s3 = sc.nextFloat();
   System.out.print("fourth number: ");
  s4 = sc.nextFloat();
  System.out.print("fifth number: ");
  s5 = sc.nextFloat();
   average=(s1+s2+s3+s4+s5)/5;
   System.out.println("Average of five numbers is: " +average);
   sc.close();
 }

}