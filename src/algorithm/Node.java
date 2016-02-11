package algorithm;

public class Node {
	private Node previous;
	private String name;
	private int distToPrev;
	
	public Node(String name) {
		this.name = name;
	}
	
	public int distanceToPrev() {
		return distToPrev;
	}
	
	public void setDistanceToPrev(int distance) {
		distToPrev = distance;
	}
	
	public void setPrevious(Node node) {
		previous = node;
	}
	
	public Node getPreviousNode() {
		return previous;
	}
	
	public String getName() {
		return name;
	}
}
