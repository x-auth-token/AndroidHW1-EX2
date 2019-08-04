import java.util.Scanner;

public class Circle extends PlaneShape {
	private Vertex v;
	private double radius;
	
	
	public Circle() {
		
	}
	
	
	public Circle(Scanner s) {
		initCircle(s);
	}


	public Vertex getV() {
		return v;
	}


	public void setV(Vertex v) {
		this.v = v;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	
	
	// initializes the circle and prints it area
	private void initCircle(Scanner s) {
		
			System.out.println("Creating Circle with given parameters");
			System.out.print("Provide radius: ");
			setRadius(s.nextDouble());
			System.out.println();
			
			System.out.println("The calculated area of the circle is: " + getArea());
			System.out.println();
			System.out.println("########################################################\n");
			
		
	}
	
}
