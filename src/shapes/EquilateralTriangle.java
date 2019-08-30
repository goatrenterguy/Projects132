package shapes;

public class EquilateralTriangle extends Triangle {
	
	//Fields - None
	
	//Constructors
	public EquilateralTriangle() {}
	public EquilateralTriangle(double side) {
		super.base = side;
		super.height = (side/2) * Math.sqrt(3) * .5;
	}
	
	//Methods
	public double getPerimeter() {
		return 3 * super.base;
	}

}
