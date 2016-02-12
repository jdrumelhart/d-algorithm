package dijkstra;
import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex implements Comparable<Vertex> {
	
	//The name of this vertex
	public final String name;
	
	//The surrounding vertices
	public ArrayList<Edge> neighbors;
	
	public LinkedList<Vertex> path;
	public double minDistance = Double.POSITIVE_INFINITY;
	public Vertex previous;

	public int compareTo(Vertex other) {
		return Double.compare(minDistance, other.minDistance);
	}

	public Vertex(String name) {
		this.name = name;
		neighbors = new ArrayList<Edge>();
		path = new LinkedList<Vertex>();
	}
	
	public void addPrev(Vertex v) {
		previous = v;
	}

	@Override
	public String toString() {
		return name;
	}
}