package shapes;

public class Circle implements Shape{
	
	//Fields
	protected double radius;
	
	//Constructors
	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}
	//methods
	@Override
	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
		
	}

	@Override
	public String printNumSides() {
		return "Infinite sides";
	}
	
	public double getDiameter() {
		return this.radius * 2;
	}

}
