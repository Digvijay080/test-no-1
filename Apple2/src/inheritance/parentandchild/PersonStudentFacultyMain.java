package inheritance.parentandchild;

public class PersonStudentFacultyMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(24);
		s.setCollege("Harsh");
		s.setContact("7040303535");
		s.setId(101);
		s.setName("Harsh");
		s.setPercentage(90);
		System.out.println("Age :"+s.getAge()+"\nCollege Name :"+s.getCollege()+"\nPerson Contact :"+s.getContact()+"\nPerson ID :"+s.getId()+"\nPerson Name :"+s.getName()+"\nPercentage :"+s.getPercentage());
		s.grade();
		System.out.println("------------------****-----------------------");
		Faculty f = new Faculty();
		f.setAge(25);
		f.setContact("7040303535");
		f.setId(101);
		f.setName("Harsh");
		f.setSalary(50000);
		f.setSubject("IT");
		System.out.println("Person Age :"+f.getAge()+"\nPerson Contact :"+f.getContact()+"\nPerson ID :"+f.getId()+"\nPerson Name :"+f.getName()+"\nPerson Salary :"+f.getSalary()+"\nSubject :"+f.getSubject());
		f.pf();
	}

}
