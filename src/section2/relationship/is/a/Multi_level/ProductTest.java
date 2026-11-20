package section2.relationship.is.a.Multi_level;

public class ProductTest {
	public static void main(String[] args) {
		SmartPhone s=new SmartPhone(1,20000,"2 yrs ","i4");
		System.out.println("id is "+s.id);
		System.out.println("price is "+s.price);
		System.out.println("warranty is "+s.warranty);
		System.out.println("processor is "+s.processor);
	}

}
