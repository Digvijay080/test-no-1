package constructers;

public class Address {
	String area,city,state,pincode;
	Address(String area,String city,String state,String pincode)
	{
		this.area=area;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
	public String toString()
	{
		return "\nArea :"+area+"\nCity :"+city+"\nState :"+state+"\nPincode :"+pincode;
	}
	
}
