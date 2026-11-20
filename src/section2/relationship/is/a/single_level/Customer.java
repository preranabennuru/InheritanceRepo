package section2.relationship.is.a.single_level;

public class Customer extends User {
	String address;

	public Customer(int id, String name, String address) {
		super(id, name);
		this.address = address;
	}
}
