package dijkstra;
import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex implements Comparable<Vertex> {
	
	//The name of this vertex
	public final String name;
	
	//The surrounding vertices
	public ArrayList<Edge> neighbors;
	
	//The path
	public LinkedList<Vertex> path;
	
	//minDistance starts off extremely high to ensure the actual minimum is found later.
	public double minDistance = Double.POSITIVE_INFINITY;
	
	//The previous node visited
	public Vertex previous;

	/**
	 * Compares the min distance of this vertex with the min distance of the other vertex. 
	 * This is done by delegating to Java's Double class.
	 * 
	 * @param other the vertex to be compared with this one
	 */
	public int compareTo(Vertex other) {
		return Double.compare(minDistance, other.minDistance);
	}

	/**
	 * Creates a new Vertex with the specified name. 
	 * 
	 * @param name the name of this vertex
	 */
	public Vertex(String name) {
		this.name = name;
		neighbors = new ArrayList<Edge>();
		path = new LinkedList<Vertex>();
	}
	
	/**
	 * Sets the last visited Vertex to the specified one.
	 * 
	 * @param v the previous vertex visited
	 */
	public void addPrev(Vertex v) {
		previous = v;
	}

	/**
	 * Returns the name of this Vertex.
	 */
	@Override
	public String toString() {
		return name;
	}
}