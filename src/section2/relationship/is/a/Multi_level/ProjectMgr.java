package section2.relationship.is.a.Multi_level;

public class ProjectMgr extends Manager {
	String projectName;

	public ProjectMgr(int id, String name, String dept, String projectName) {
		super(id, name, dept);
		this.projectName = projectName;
	}

}
