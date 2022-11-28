package classesandobjects;
import java.util.Scanner;
public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Subject marks : ");
		float s1=sc.nextInt();
		
		System.out.println("Secound subject marks : ");
		float s2=sc.nextInt();
		
		System.out.println("Third subiect marks : ");
		float s3=sc.nextInt();
		
		System.out.println("Fourth Subject marks : ");
		float s4=sc.nextInt();
		
		System.out.println("Fifth Subject marks : ");
		float s5=sc.nextInt();
		
		Student a1=new Student();
		float p=a1.percentage(s1, s2, s3, s4, s5);
		a1.grade(p);
		
		sc.close();
		
	}

}
