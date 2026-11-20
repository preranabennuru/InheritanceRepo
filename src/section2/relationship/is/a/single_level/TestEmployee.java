package section2.relationship.is.a.single_level;

public class TestEmployee {
	public static void main(String[] args) {
		Manager m=new Manager(101,"smith",76566.79,"hr");
		System.out.println("id is : "+m.id);
		System.out.println("name is : "+m.name);
		System.out.println("salary is : "+m.salary);
		System.out.println("dept is : "+m.dept);
	}

}
