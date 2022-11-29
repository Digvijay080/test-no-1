import java.util.Scanner;
public class AnglesOfTriangle {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("First angle : ");
		a=sc.nextInt();
		
		System.out.println("Secound angle : ");
		b=sc.nextInt();
		
		c=180-(a+b);
		System.out.println("Third angle : "+c);

	}

}
