package inheritance.parentandchild;

public class GrandFather {
	String fn,mn;
	static String ln="Deshmukh";
	public void setFn(String fn) {
		this.fn = fn;
	}
	public void setMn(String mn) {
		this.mn = mn;
	}
	void display()
	{
		System.out.println(fn+" "+mn+" "+ln);
	}
}	
	class Dad extends GrandFather
	{
		String fn1;
		
		public void setFn1(String fn1) {
			this.fn1 = fn1;
		}

		void display()
		{
			super.display();
	     System.out.println(fn1+" "+super.fn+" "+ln);
		}
	
	}
	class Child extends Dad
	{
		String fn2;
		
		public void setFn2(String fn2) {
			this.fn2 = fn2;
		}

		void display()
		{
			super.display();
			System.out.println(fn2+" "+super.fn1+" "+ln);
		}
	}
	
	


