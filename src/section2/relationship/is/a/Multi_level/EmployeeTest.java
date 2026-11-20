package section2.relationship.is.a.Multi_level;

public class EmployeeTest {
	public static void main(String[] args) {
		ProjectMgr p=new ProjectMgr(12,"Prerana","Testing","Cafe Management");
		System.out.println("id is "+p.id);
		System.out.println("name is "+p.name);
		System.out.println("department is "+p.dept);
		System.out.println("project name is "+p.projectName);
	}

}
