import java.util.Scanner;
public class CalculateTotalAverageAndPercentage {

	public static void main(String[] args) {
	   
		int s1,s2,s3,s4,s5,total;
		float average,percentage;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Subject marks : ");
		s1=sc.nextInt();
		
		System.out.println("Secound subject marks : ");
		s2=sc.nextInt();
		
		System.out.println("Third subiect marks : ");
		s3=sc.nextInt();
		
		System.out.println("Fourth Subject marks : ");
		s4=sc.nextInt();
		
		System.out.println("Fifth Subject marks : ");
		s5=sc.nextInt();
		
		total=s1+s2+s3+s4+s5;
		System.out.println("Total of five subject marks : "+total);
		
		average=total/5f;
		System.out.println("Average of five subject : "+average);
		
		percentage=(total/500f)*100f;
		System.out.println("Percentage of five subject : "+percentage);
		
		

	}

}
