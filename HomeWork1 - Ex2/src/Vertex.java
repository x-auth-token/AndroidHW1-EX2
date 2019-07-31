
public class Vertex {
	
	private double x;
	private double y;
	
	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// Sets X coordinate
	public void setX(double x) {
		this.x = x;
		
	}
	
	// Sets Y coordinate
	public void setY(double y) {
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	public double calculateDistance(Vertex a, Vertex b) {
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2) );
	}
}
