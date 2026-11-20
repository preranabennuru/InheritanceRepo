package section2.relationship.is.a.Multi_level;

public class WhatsAppUser extends AppUser{
	String lastseen;

	public WhatsAppUser(int id, String name, long phNo, String lastseen) {
		super(id, name, phNo);
		this.lastseen = lastseen;
	}
}
