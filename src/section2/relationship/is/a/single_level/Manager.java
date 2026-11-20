package section2.relationship.is.a.single_level;

public class Manager extends Employee{
	String dept;

	public Manager(int id, String name, double salary, String dept) {
		super(id, name, salary);
		this.dept = dept;
	}
}
