package shapes;

public class Rectangle implements Shape{
	
	//Fields
	protected double height;
	protected double width;
	
	//Constructors
	/**
	 *Constructs a new rectangle instance with a 
	 *default of 0 for both width and height
	 */
	public Rectangle() {}
	/**
	 * Constructs a new rectangle instance
	 * @param w The width of the rectangle
	 * @param h The height of the rectangle
	 */
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	//Methods
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public double getPerimeter() {
		return (2*height) + (2*width);
	}
	
	@Override
	public String printNumSides() {
		return "Four sides";
	}
}
