package dijkstra;
public class Edge {
	
	//The destination of this edge
	public final Vertex target;
	
	//The starting point of this edge
	public final Vertex origin;
	
	//The weight(length) of this edge
	public final double weight;

	/**
	 * Creates an Edge between two Vertices. This is a one-way link.
	 * 
	 * @param origin the starting point
	 * @param target the ending point
	 * @param weight the length
	 */
	public Edge(Vertex origin, Vertex target, double weight) {
		this.origin = origin;
		this.target = target;
		this.weight = weight;
	}
}