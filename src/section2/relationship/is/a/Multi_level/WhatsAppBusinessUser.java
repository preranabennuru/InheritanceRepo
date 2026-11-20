package section2.relationship.is.a.Multi_level;

public class WhatsAppBusinessUser extends WhatsAppUser {
	String businessName;

	public WhatsAppBusinessUser(int id, String name, long phNo, String lastseen, String businessName) {
		super(id, name, phNo, lastseen);
		this.businessName = businessName;
	}

}
