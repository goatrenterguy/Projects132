package shapes;

public class RightTriangle extends Triangle{
	//Fields
	protected double C;
	
	//Constructors
	public RightTriangle() {}
	public RightTriangle(double A, double B) {
		super.base = A / 2 ;
		super.height = B;
		C = getHypotenuse();
	}
	
	//Methods
	public double getHypotenuse() {
		return Math.sqrt((Math.pow((super.base * 2), 2) + Math.pow(super.height, 2)));
	}
	
	@Override
	public double getPerimeter() {
		return ((super.base * 2) + super.height + C);
	}

}
