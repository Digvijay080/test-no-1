package constructers;

public class Person {
	int id,age;
	 String name,contact;
     Address add;
     Person(int id,String name,String contact,int age,Address add)
     {
    	 this.id=id;
    	 this.name=name;
    	 this.contact=contact;
    	 this.age=age;
    	 this.add=add;
     }
     public String toString()
     {
    	 return "Name :"+name+"\nContact :"+contact+" "+add;
     }

}
