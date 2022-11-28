import java.util.Scanner;
public class StateCapital {

	public static void main(String[] args) {
		String state;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter State name : ");
          state=sc.next();
          
          if (state.equals("Maharastra"))
          {
        	  System.out.println("Mumbai");
          }
          else if (state.equals("Karnataka"))
          {
        	  System.out.println("Bangalore");
          }
          else if (state.equals("Gujarat"))
          {
        	  System.out.println("Gandhinagar");
          }
          else if (state.equals("Kerala"))
          {
        	  System.out.println("Thiruanantpura");
          }
          else
          {
        	  System.out.println("Enter valid state name");
          }
          sc.close();
	}

}
