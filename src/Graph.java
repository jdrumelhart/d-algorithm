import java.util.ArrayList;

public class Graph {
	private ArrayList<Vertex> vertices;

//	public Graph(int numberVertices) {
//		vertices = new ArrayList<Vertex>(numberVertices);
//		for (int i = 0; i < numberVertices; i++) {
//			vertices.add(new Vertex("Vertex " + Integer.toString(i)));
//		}
//	}
	
	public Graph(ArrayList<Vertex> vertices) {
		this.vertices = vertices;
	}

	public void addEdge(Vertex src, Vertex dest, int weight) {
		Vertex s = null;
		Vertex d = null;
		if(vertices.contains(src)) {
			s = src;
		}
		if(vertices.contains(dest)) {
			d = dest;
		}
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