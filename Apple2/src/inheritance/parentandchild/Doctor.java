package inheritance.parentandchild;

public class Doctor extends Person1 {
    int  id ;
   String   specialization ,lisence;
public void setId(int id) {
	this.id = id;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public void setLisence(String lisence) {
	this.lisence = lisence;
}
   
   void display()
   { 
	   super.display();
	   System.out.println(id+" "+specialization+" "+lisence);
   }
}
