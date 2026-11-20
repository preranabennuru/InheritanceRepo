package section2.relationship.is.a.single_level;

public class Car extends Vehicle {
	String fuelType;

	public Car(String brand, int speed, String fuelType) {
		super(brand, speed);
		this.fuelType = fuelType;
	}
}
