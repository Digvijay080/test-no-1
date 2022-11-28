package polymorphism;
public class TypeCast {
	void convert(double a)
	{
		int b=(int)a;
		System.out.println(" Double to Integer is :"+b);
	}
	void convert(float a)
	{
		int b=(int)a;
		System.out.println("Float to Integer is :"+b);
		
	}
	void convert(long a)
	{
		int b=(int)a;
		System.out.println(" Long to Integer is :"+b);
	}
   void convert(char a)
   {
	   int b=(int)a;
		System.out.println("Character to Integer is :"+b);
	   
   }
	public static void main(String[] args) {
		TypeCast t1=new TypeCast();
		
		t1.convert(2.4);
		t1.convert('a');
		t1.convert(3.4f);
		

	}

}
