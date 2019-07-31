import java.util.Scanner;

public class Rectangle extends PlaneShape {
	private Vertex v;
	private double width;
	private double height;
	
	public Rectangle() {
	
	}
	
	public Rectangle(Scanner s) {
		initRectangle(s);
	};

	public Vertex getV() {
		return v;
	}

	public void setV(Vertex v) {
		this.v = v;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width * 2) + (height * 2);
	}
	
	
	private void initRectangle(Scanner s) {
		System.out.println("Creating Rectangle with given parameters");
		System.out.print("Provide width: ");
		setWidth(s.nextDouble());
		System.out.println();
		System.out.print("Provide height: ");
		setHeight(s.nextDouble());
		System.out.println();
		System.out.println("The calculated area of the rectangle is: " + getArea());
		System.out.println();
		System.out.println("########################################################");
	}
	
	
}
