package dijkstra;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra {

	/**
	 * Representation Invariant
	 * 
	 * The String in the HashMap<String, Integer> must be one of the keys in HashMap<String, HashMap<String, Integer>>
	 * The Integer in the HashMap<String, Integer> must be non-negative
	 * startNode must be one of the keys in HashMap<String, HashMap<String, Integer>>
	 * 
	 * 
	 * Abstraction Function
	 * 
	 * 
	 * 
	 */
	
	public HashMap<String,String> path;
	public HashMap<String,Vertex> vertices;
	
	Graph g;
	
	public Dijkstra(HashMap<String, HashMap<String, Integer>> map, String startNode) {
		path = new HashMap<String,String>();
		vertices = new HashMap<String,Vertex>();
		//Places all of the strings from the map into Vertex form
		for(String s:map.keySet()) {
			vertices.put(s,new Vertex(s));
		}
		ArrayList<Vertex> x = new ArrayList(vertices.entrySet());
		g = new Graph(x);
		//Adds all of the edges into the graph
		for(String origin:map.keySet()) {
			for(String dest:map.get(origin).keySet()) {
				g.addEdge(vertices.get(origin), vertices.get(dest), map.get(origin).get(dest));
			}
		}
		
		//Calls the calculate method to determine shortest path
		calculate(vertices.get(startNode));
		
		//Places the shortest path into the HashMap path
		Vertex v = g.getVertex(g.getVertices().size() - 1);
		for(int i = v.path.size(); i > 0; i--) {
			path.put(v.path.get(i).name, v.path.get(i-1).name);
		}
	}

	/**
	 * Calculates the shortest path from the given vertex to all other nodes
	 * @param source The first vertex
	 */
	public void calculate(Vertex source){
		// 1. Take the unvisited node with minimum weight.
		// 2. Visit all its neighbors.
		// 3. Update the distances for all the neighbors (In the Priority Queue).
		// Repeat the process until all the connected nodes are visited.
		
		source.minDistance = 0;
		
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
		queue.add(source);
		
		while(!queue.isEmpty()){
			
			Vertex u = queue.poll();
		
			for(Edge neighbor:u.neighbors){
				Double newDist = u.minDistance+neighbor.weight;
				
				if(neighbor.target.minDistance>newDist){
					// Remove the node from the queue to update the distance value.
					queue.remove(neighbor.target);
					neighbor.target.minDistance = newDist;
					
					// Take the path visited till now and add the new node.
					
					neighbor.target.path = new LinkedList<Vertex>(u.path);
					neighbor.target.path.add(u);
					
					//Reenter the node with new distance.
					queue.add(neighbor.target);					
				}
			}
		}
	}
}