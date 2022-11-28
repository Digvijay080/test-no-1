package assignment4;

public class TypeCasting {
	void compare(int x,int y)
	{
		if(x<y)
		{
			System.out.println(y+" is greater");
		}else{
			System.out.println();
		}
	}
	void compare(char x,char y)
	{
		if((int)x<(int)y)
		{
			System.out.println(y+" is greater");
		}
		else{
			System.out.println(x+" is greater");
		}
	}

	public static void main(String[] args) {
		TypeCasting t=new TypeCasting();
		t.compare(25, 70);
		t.compare('R', 'N');

	}

}
