package inheritance.containment;

public class EngineSetAndGet {
	private int power,torque;
	private String company;
	public void setPower(int power)
	{
	 this.power=power;
	}
	public int getPower()
	{
		return power;
	}
	public void setTorque(int torque)
	{
		this.torque=torque;
	}
	public int getTorque()
	{
		return torque;
	}
	public void setCompany(String company)
	{
	   this.company=company;	
	}
	public String getConpany()
	{
		return company;
	}
	public String toString()
	{
		return "Power :"+power+"watt\nTorque :"+torque+"nm \nCompany :"+company;
	}

}
