package section2.relationship.is.a.Multi_level;

public class GraduateStudent extends Student {
	String thesisTitle;

	public GraduateStudent(String name, int age, int rollNo, String course, String thesisTitle) {
		super(name, age, rollNo, course);
		this.thesisTitle = thesisTitle;
	}

}
