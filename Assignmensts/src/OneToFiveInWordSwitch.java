import java.util.Scanner;
  public class OneToFiveInWordSwitch {
  public static void main(String[] args) {
	 int a;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter number : ");
	 a=sc.nextInt();
	 
	 switch(a)
	 {
	 case 1:System.out.println("One");
	        break;
	 case 2:System.out.println("Two");
            break;
	 case 3:System.out.println("Three");
            break;
	 case 4:System.out.println("Four");
            break;
	 case 5:System.out.println("Five");
            break;
     default:
    	    System.out.println("Error");
     
	}	
}
}
