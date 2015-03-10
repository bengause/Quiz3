package Code;

public class Triangle extends GeometricObject {

	// Create 3 double data fields
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// Create a no-arg constructor for triangle
	public Triangle() {

	}

	// Create a constructor for a triangle with specified values
	public Triangle(double side1, double side2, double side3) {

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Another constructor with other class's values
	public Triangle(double side1, double side2, double side3, String color,
			boolean filled) {

		super(color, filled);

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	// Getters for values
	public double getside1() {
		return side1;
	}

	public double getside2() {
		return side2;
	}

	public double getside3() {
		return side3;
	}

	// getPerimeter method
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// getArea method
	@Override
	public double getArea() {
		double s = getPerimeter() / 2;
		double t = s * (s - side1) * (s - side2) * (s - side3);
		return Math.pow(t, 0.5);
	}

	// toString method
	// Must be overrided because it is a default method in the object class
	@Override
	public String toString() {
		return ("The Triangle's three sides are " + side1 + ", " + side2 + ", "
				+ side3 + ".\n The triangle is colored " + getColor()
				+ "\n Is it filled? " + isFilled());
	}

}
