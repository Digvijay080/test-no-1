package polymorphism;

public class Addition {
	void add(int a,int b)
	{
		System.out.println("Addition of two Integers :"+(a+b));
	}
   void add(String a,String b) //data type is different
   {
	   System.out.println("Addition of two Strings is :"+(a+b));
   }
   void add(String name ,int marks)  //sequence of parameters is different
   {
	   System.out.println("Addition of String and Integer is :"+(name+marks));
   }
   void add(int a,String b)
   {
	   System.out.println("Addition of Integer and String is :"+(a+b));
   }
   void add(int a,int b,int c)   //no of parameters is different
   {
	   System.out.println("Addition of three Integers is :"+(a+b+c));
   }
	public static void main(String[] args) {
		
		Addition a=new Addition();
		
		a.add(100, 200);
		a.add(100, "ABC");
		a.add("XYZ", 90);
		a.add("ABC", "XYZ");
		a.add(100, 200, 300);

	}

}
