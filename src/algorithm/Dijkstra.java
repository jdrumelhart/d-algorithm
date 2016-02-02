package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
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
	
	public Dijkstra(HashMap<String,HashMap<String, Integer>> h, String s) {
		nodes.add(new Node(s));
	}
	
	public void findMin() {
		
	}
}