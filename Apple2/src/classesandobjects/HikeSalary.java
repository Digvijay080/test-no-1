package classesandobjects;

public class HikeSalary {
float hike(float salary,char rating)
{
	float hike,newSal=0;
	if(rating=='A')
	{
		hike=salary*0.2f;
		newSal=salary+hike;
	}
	else if(rating=='B')
	{
		hike=salary*0.15f;
		newSal=salary+hike;
	}
	else if(rating=='C')
	{
		hike=salary*0.1f;
		newSal=salary+hike;
	}
	else
	{
		System.out.println("Sorry poor rating no increment...!!!");
	}
	System.out.println("Hike Salary :"+newSal);
	return newSal;

}

void pfcalculate(float salary)
{
	float pf=salary*0.15f;
	System.out.println("Salary :"+salary);
	System.out.println("PF : "+pf);
	System.out.println("New Salary "+(salary-pf));
	float ebonus=salary*0.25f;
	System.out.println("Bonus is : "+ebonus);
}

	public static void main(String[] args) {
		

	}

}
