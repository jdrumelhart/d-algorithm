package graph;

public class Edge {
	
	private final String id;
	private final Node startPoint;
	private final Node endPoint;
	private final int weight;
	
	public Edge(String identification, Node startPoint, Node endPoint, int weight) {
		this.id = identification;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.weight = weight;
	}
	
	public String getID() {
		return this.id;
	}
	
	public Node getStartPoint() {
		return this.startPoint;
	}
	
	public Node getEndPoint() {
		return this.endPoint;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return startPoint + " " + endPoint;
	}
}
