import java.util.Scanner;
public class UpperCaseOrLowerCase {

	public static void main(String[] args) {
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Alphabet : ");
		ch = sc.next().charAt(0);
		if(ch=='a'||ch=='a'||ch=='c'||ch=='d'||ch=='e'||ch=='f'||ch=='g'||ch=='h'||ch=='i'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='o'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='u'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z')
			
		{
			System.out.println("Lowercase ");
		}
		else
		{
		System.out.println("Uppercase");	
		}
		
	
		

	}

}
