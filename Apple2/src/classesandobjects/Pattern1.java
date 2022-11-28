package classesandobjects;

public class Pattern1 {
	void starPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void numberPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
	void downwardpyramidPattern()
	{
		for(int i=4; i>=1; i--)
	    {
	          
	        for(int k=i;k<4;k++)
	        {
	            System.out.print(" ");
	        }
	          
	        for(int j = 1; j<=(2*i-1); j++)
	        {
	            System.out.print("*");
	        }
	
	        System.out.println("");
	    } 
	}

	public static void main(String[] args) {
	Pattern1 p1=new Pattern1();
	p1.starPattern();
	
	Pattern1 p2=new Pattern1();
	p2.numberPattern();
	
	Pattern1 p3=new Pattern1();
	p3.downwardpyramidPattern();
	

	}

}
