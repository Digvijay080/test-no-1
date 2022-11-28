import java.util.Scanner;
public class VowelOrConsonant {
public static void main(String[] args) {
	 char ch;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Alphabet : ");
	ch = sc.next().charAt(0);
	if (ch== 'A' || ch== 'a' )
	{
		System.out.println("Its Vowel");	
	}
	else if (ch== 'E' || ch== 'e' )
	{
		System.out.println("Its Vowel");
	}
	else if (ch== 'I' || ch=='i' )
	{
		System.out.println("Its Vowel");	
	}
	else if (ch== 'O' || ch== 'o' )
	{
		System.out.println("Its Vowel");	
	}

	else if (ch== 'U' || ch== 'u' )
	{
		System.out.println("Its Vowel");
		
	}

	else 
	{
		System.out.println("Its Consonant");
	}
}
}
