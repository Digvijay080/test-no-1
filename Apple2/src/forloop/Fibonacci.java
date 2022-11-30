package forloop;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c;    
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 for(int i=2;i<=num;++i)
		 {    
		  System.out.print(a+" ");
		  c=a+b;
		  a=b;    
		  b=c;  
		 } 
		 
		 sc.close();

	}

}
