package inheritance.containment;

public class CarSetAndGet {
	int id,price;
	String cname,name;
	EngineSetAndGet eng;
	
	public void setId(int id)
	{
		this.id=id;
	}
    public int gteId()
    {
    	return id;
    }
    public void setPrice(int price)
	{
		this.price=price;
	}
    public int gtePrice()
    {
    	return price;
    }
    public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
    public void setCname(String cname)
	{
		this.cname=cname;
	}
	public String getCname()
	{
		return cname;
	}
	public void setEng(EngineSetAndGet eng)
	{
		this.eng=eng;
	}
	public EngineSetAndGet getEng()
	{
		return eng;
	}
	
}
