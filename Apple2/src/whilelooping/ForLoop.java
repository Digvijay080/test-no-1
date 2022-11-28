package whilelooping;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		int i,e;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter start and end numbers : ");
		i=sc.nextInt();
		e=sc.nextInt();
	 for(;i<=e;i++)
	 {
      System.out.println(i);
	}

}
}