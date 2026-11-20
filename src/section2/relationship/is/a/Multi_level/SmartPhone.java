package section2.relationship.is.a.Multi_level;

public class SmartPhone extends ElectronicItem {
	String processor;

	public SmartPhone(int id, double price, String warranty, String processor) {
		super(id, price, warranty);
		this.processor = processor;
	}

}
