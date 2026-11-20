package section2.relationship.is.a.Multi_level;

public class AppUserTest {
	public static void main(String[] args) {
		WhatsAppBusinessUser w =new WhatsAppBusinessUser(1,"allen",9876543329l,"22:10","WhatsApp");
		System.out.println("id is "+w.id);
		System.out.println("name is "+w.name);
		System.out.println("phone no is "+w.phNo);
		System.out.println("lastseen  is "+w.lastseen);
		System.out.println("business name is "+w.businessName);
	}

}
