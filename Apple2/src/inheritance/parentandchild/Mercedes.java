package inheritance.parentandchild;

public class Mercedes extends Car1 {
	void dashboard()
	{
		super.dashboard();   // represent immediate parant class
		System.out.println("Screen");
	}
	
	void enginePower()
	{
		System.out.println("Mercedes : 1190 CC");
	}
}
