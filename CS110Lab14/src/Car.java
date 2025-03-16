public class Car {

	// instance variables/fields
	private String type;
	private String model;
	private String color = " ";
	private int speed = 0;

	// constructor
	public Car(String type, String model) {
		this.type = type;
		this.model = model;

	}

	// constructor
	public Car(String type, String model, String color) {
		this.type = type;
		this.model = model;
		this.color = color;

	}

	// method to increase speed
	public int increaseSpeed(int increment) {
		this.speed = this.speed + increment;
		return this.speed;
	}

	// method to print car information
	public static void print(Car car) {
		System.out.println("Type: " + car.type);
		System.out.println("Model: " + car.model);
		if (!car.color.isBlank()) {
			System.out.println("Color: " + car.color);
		}
		System.out.println("Speed: " + car.speed + " miles per hour");
		System.out.println();
	}

}