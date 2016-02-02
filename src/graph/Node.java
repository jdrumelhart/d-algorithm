package graph;

public class Node {
	
	private String id;
	private String name;
	
	public Node(String identification, String name) {
		this.id = identification;
		this.name = name;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
}
