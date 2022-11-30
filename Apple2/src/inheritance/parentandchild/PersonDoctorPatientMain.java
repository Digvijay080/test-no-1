package inheritance.parentandchild;

public class PersonDoctorPatientMain {

	public static void main(String[] args) {
		Doctor d=new Doctor();
		d.setName("Harsh");
		d.setAge(24);
		d.setContact("7040303535");
		d.setGender("Male");
		d.setId(101);
		d.setSpecialization("Radiology");
		d.setLisence("Till 2022");
		System.out.println("Doctor information :");
		d.display();
		
		System.out.println("------------********----------");
		Patient p=new Patient();
		p.setName("Onkar");
		p.setAge(24);
		p.setContact("9404656564");
		p.setGender("Male");
		p.setId(103);
		p.setBedno(3002);
	    p.setDisease("Dengue");
	    System.out.println("Patient information :");
	    p.display();
	}

}
