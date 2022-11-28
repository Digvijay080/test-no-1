package assignment3;

public class Pattern {
	void pattern1()
	{
		
		System.out.println("First Pattern");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	void pattern2()
	{
		System.out.println("Secound Pattern");
		for(int i=1; i<=4; i++)
		{
			  for(int j=1; j<=i; j++)
			  {
			  if(i%2==1)
			  {
			    System.out.print("0");
	          }
			  else
			  {
			    System.out.print("1");
			  }
			   
		      }
			  System.out.println();
		}	
	}
	

	public static void main(String[] args) {
      Pattern p1=new Pattern();
      p1.pattern1();
      p1.pattern2();

	}

}
