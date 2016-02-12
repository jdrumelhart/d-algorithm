import java.util.ArrayList;

public class Graph {
	private ArrayList<Vertex> vertices;

	public Graph(int numberVertices) {
		vertices = new ArrayList<Vertex>(numberVertices);
		for (int i = 0; i < numberVertices; i++) {
			vertices.add(new Vertex("Vertex " + Integer.toString(i)));
		}
	}

	public void addEdge(int src, int dest, int weight) {
		Vertex s = vertices.get(src);
		Edge new_edge = new Edge(vertices.get(dest), weight);
		s.neighbors.add(new_edge);
	}

	public ArrayList<Vertex> getVertices() {
		return vertices;
	}

	public Vertex getVertex(int vert) {
		return vertices.get(vert);
	}
}