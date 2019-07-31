import java.util.List;

public abstract class Shape {
	
	List<Vertex> vertices;
	
	public Shape() {
		
	}
	
	
	public List<Vertex> getVertices() {
		return vertices;
	}
	
	public void addVertex(Vertex v) {
		vertices.add(v);
	}
	
	public void removeVertex(Vertex v) {
		vertices.remove(v);
	}
	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}
	
} 
