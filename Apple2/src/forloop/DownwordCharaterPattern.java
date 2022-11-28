package forloop;

public class DownwordCharaterPattern {

	public static void main(String[] args) {
		for(char i='e'; i>='a'; i--)
	    {
	        for(char j=i; j>='a'; j--)
	        {
	            System.out.print( j);
	        }
	        System.out.println();
	}

	}

}
