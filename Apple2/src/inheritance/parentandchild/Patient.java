package inheritance.parentandchild;

public class Patient extends Person1 {
	int id,bedno;
	String disease;
	public void setId(int id) {
		this.id = id;
	}
	public void setBedno(int bedno) {
		this.bedno = bedno;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	void display()
	{
		super.display();
		System.out.println(id+" "+bedno+" "+disease);
	}

}
