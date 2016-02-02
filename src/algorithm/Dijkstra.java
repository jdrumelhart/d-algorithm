package algorithm;

import java.util.ArrayList;
import java.util.List;

import graph.Graph;
import graph.Edge;
import graph.Node;

public class Dijkstra {
	private final List<Node> nodes;
	private final List<Edge> edges;
	
	public Dijkstra(Graph graph) {
		this.nodes = new ArrayList<Node>(graph.getNodes());
		this.edges = new ArrayList<Edge>(graph.getEdges());
	}
	
	public void findMin() {
		
	}
}