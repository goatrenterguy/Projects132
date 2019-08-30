package shapes;

public class ShapeDemo {

	public static void main(String[] args) {
		//Create circle
		Circle circle = new Circle(2);
		System.out.println("I made a Circle of Type Circle with radius of 2.");
		System.out.println("The area is: " + circle.getArea());
		System.out.println("The circumference is: " + circle.getPerimeter());
		System.out.println(circle.printNumSides());
		System.out.println("The diameter is: " + circle.getDiameter());
		System.out.println();
		
		//Create Shape circle 
		Shape A = new Circle(3);
		System.out.println("I made a Shape of Type Circle with radius of 3.");
		System.out.println("The area is: " + A.getArea());
		System.out.println("The circumference is: " + A.getPerimeter());
		System.out.println(A.printNumSides());
		System.out.println("Well, I can't get the diameter of a 'Shape.' (I tried.) But since \n" + 
				"I know the object being referenced is a Circle, I can cast it \n" + 
				"to a Circle, and then I can get the diameter of it...The diameter is: " + ((Circle) A).getDiameter());
		System.out.println();
		
		//Create Shape of EquilateralTriangle
		Shape B = new EquilateralTriangle(4);
		System.out.println("I made a Shape of type EquilateralTriangle with side length of 4.");
		System.out.println("The area is: " + B.getArea());
		System.out.println("The perimeter is: " + B.getPerimeter());
		System.out.println();
		
		//Create a RightTriangle of type RightTriagle
		RightTriangle C = new RightTriangle(3,4);
		System.out.println("I made a RightTriangle of type RightTriangle with side length of 3,4.");
		System.out.println("The area is: " + C.getArea());
		System.out.println(C.printNumSides());
		System.out.println("The hyptonuse: " + C.getHypotenuse());
		System.out.println("Perimeter is: " + C.getPerimeter());
		System.out.println();
		
		//Create square
		Square D = new Square(5);
		System.out.println("I made a Square of type Square with side length of 5.");
		System.out.println("The area is: " + D.getArea());
		System.out.println("The perimeter is: " + D.getPerimeter());
		System.out.println(D.printNumSides());
		System.out.println();
	}

}
