package section2.relationship.is.a.Multi_level;

public class Student extends Person{
	int rollNo;
	String course;
	public Student(String name, int age, int rollNo, String course) {
		super(name, age);
		this.rollNo = rollNo;
		this.course = course;
	}

}
