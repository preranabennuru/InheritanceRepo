package section2.relationship.is.a.Multi_level;

public class Manager extends Employee{
	String dept;

	public Manager(int id, String name, String dept) {
		super(id, name);
		this.dept = dept;
	}
}
