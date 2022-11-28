package inheritance.containment;

public class Address {
	private String area,city,state,pincode;
	
	   public void setArea(String area)
		{
			this.area=area;
		}
		public String getArea()
		{
			return area;	
	    }
		
	   public void setCity(String city)
			{
				this.city=city;
			}
	   public String getCity()
			{
				return city;
			}
		
	   
	   public void setState(String state)
				{
					this.state=state;
				}
		public String getState()
				{
					return state;
				}

		 public void setPincode(String pincode)
					{
						this.pincode=pincode;
					}
		 public String getPincode()
				{
						return pincode;
				}
		 
		 /* public String toString()
		 {
			 return area+" "+city+" "+state+" "+pincode;
		 }*/
		 
		 
}
