package section2.relationship.is.a.single_level;

public class CarDetails {
	public static void main(String[] args) {
		Car c=new Car("Porshe",600,"Petrol");
		System.out.println("brand is : "+c.brand);
		System.out.println("speed is : "+c.speed);
		System.out.println("fuelType is : "+c.fuelType);
	}
}
