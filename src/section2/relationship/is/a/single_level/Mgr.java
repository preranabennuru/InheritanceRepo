package section2.relationship.is.a.single_level;

public class Mgr extends Employe{
	int deptno;
	public Mgr(int id,String name,int deptno) {
		super(id,name);
		this.deptno=deptno;
	}

}
