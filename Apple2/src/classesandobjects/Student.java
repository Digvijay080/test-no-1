package classesandobjects;

public class Student {
	float percentage(float m1,float m2,float m3,float m4,float m5)
	{
		float per=((m1+m2+m3+m4+m5)/500f)*100f;
		System.out.println("Percentage of student : "+per);
		return per;
	}
	void grade(float per)
	{
		if (per>75)
        {
       	 System.out.println("Distinction");
        }
        else if(per>60)
        {
       	 System.out.println("Grade :First class");
        }
        else if (per>55)
        {
       	 System.out.println("Grade :Secound class");
        }
        else if(per>50)
        {
       	 System.out.println("Grade :higher class");
        }
        else if (per>35)
        {
       	 System.out.println("Grade :Pass class");
        }
        else
        {
       	 System.out.println("Grade : Fail");
       	 
        }
	
	}
	public static void main(String[] args) {
		
	}

}
