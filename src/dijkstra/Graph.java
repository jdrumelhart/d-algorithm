package dijkstra;
import java.util.ArrayList;

public class Graph {
	
	//All the vertices in the Graph.
	private ArrayList<Vertex> vertices;

	/**
	 * Initializes the vertices of the graph.
	 * 
	 * @param vertices The vertices in the graph
	 */
	public Graph(ArrayList<Vertex> vertices) {
		this.vertices = vertices;
	}

	/**
	 * Adds an edge to the graph. The edge is from the starting point to the ending point and has the specified length.
	 * 
	 * @param src the starting point of the Edge
	 * @param dest the ending point of the Edge
	 * @param weight the length of the Edge
	 */
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

	/**
	 * Gets all the vertices of the graph in ArrayList form.
	 * 
	 * @return an ArrayList of all vertices in the graph.
	 */
	public ArrayList<Vertex> getVertices() {
		return vertices;
	}

	/**
	 * Gets the specified vertex.
	 * 
	 * @param vert the index of the desired vertex
	 * @return the desired vertex
	 */
	public Vertex getVertex(int vert) {
		return vertices.get(vert);
	}
}