package section2.relationship.is.a.single_level;

public class UserDetails {
	public static void main(String[] args) {
		Customer c=new Customer(123,"xyz","d/o abc, \n defghi nilaya,ckm. \n 577101");
		System.out.println("id is "+c.id);
		System.out.println("name is "+c.name);
		System.out.println("address is "+c.address);
	}

}
