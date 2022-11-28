package whilelooping;

public class CountOddNumber {

	public static void main(String[] args) {
		int i,count=0;
		for(i=1;i<=25;i++)
		{
			if(i%2!=0)
			{
				count++;
				
			}
			
		}
		System.out.println(count+"");
	}

}
