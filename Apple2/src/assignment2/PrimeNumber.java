package assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
     for(int i=400;i>=300;i--)
     {
    	 int c=0;
    	 for(int j=2;j<i;j++)
    	 {
    		 if(i%j==0)
    		 {
    			 c++;
    			 break;
    		 }
    	 }
    	 if(c==0)
    	 {
    		 System.out.println(i+"");
    	 }
     }

	}

}
