package section2.relationship.is.a.Multi_level;

public class ElectronicItem extends Product {
	String warranty;
	public ElectronicItem(int id, double price, String warranty) {
		super(id, price);
		this.warranty = warranty;
	}

}
