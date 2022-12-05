package assignment5;

public class IdProof {
	int number,validity;
    String name;
    
    IdProof(String name,int number,int validity)
    {
    	this.name=name;
    	this.number=number;
    	this.validity=validity;
    }
    public String toString()
    {
    	return name+" "+number+" "+validity;
    }
}
