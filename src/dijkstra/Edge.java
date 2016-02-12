package dijkstra;
public class Edge {
	public final Vertex target;
	public final Vertex origin;
	public final double weight;

	public Edge(Vertex origin, Vertex target, double weight) {
		this.origin = origin;
		this.target = target;
		this.weight = weight;
	}
}