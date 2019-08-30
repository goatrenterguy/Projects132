package shapes;

public abstract class Triangle implements Shape {
	
	//Fields
	protected double base;
	protected double height;
	
	//Methods
	@Override
	public double getArea() {
		return base * height;
	}
	@Override
	public String printNumSides() {
		return "Three sides";
	}
}
