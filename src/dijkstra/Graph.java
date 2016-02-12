package dijkstra;
import java.util.ArrayList;

public class Graph {
	private ArrayList<Vertex> vertices;

	public Graph(ArrayList<Vertex> vertices) {
		this.vertices = vertices;
	}

	public void addEdge(Vertex src, Vertex dest, int weight) {
		Vertex s = null;
		Vertex d = null;
		s = src;
		d = dest;
		Edge new_edge = new Edge(s, d, weight);
		//Key line
		//Allows the rest of the graph to function
		s.neighbors.add(new_edge);
	}

	public ArrayList<Vertex> getVertices() {
		return vertices;
	}

	public Vertex getVertex(int vert) {
		return vertices.get(vert);
	}
}