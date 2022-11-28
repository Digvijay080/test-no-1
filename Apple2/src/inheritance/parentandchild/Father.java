package inheritance.parentandchild;

public class Father {
	int age;
	String name;
	static String surname="xyz";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void address()
	{
		System.out.println("Staying in Pune ...!!!");
	}

}
