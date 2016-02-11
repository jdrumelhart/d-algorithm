package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Dijkstra implements Shorty {

	//This is the HashMap that will ultimately be accessed by the interfacing program
	public HashMap<String, String> path;
	public String currentNode;
	public HashMap<String, Boolean> visited;
//	public ArrayList<HashMap<String, Integer>> dist;
	public ArrayList<String> prev;
	public ArrayList<String> nodes;
	public ArrayList<String> surroundingNodes;
	public HashMap<String, HashMap<String, Integer>> map;
	private String startNode;
	private HashMap<String, Integer> distanceFromStart;

	public Dijkstra(HashMap<String, HashMap<String, Integer>> map, String startNode) {
		this.map = map;
		
		//the list of all nodes in the graph
		nodes = new ArrayList<String>(map.keySet());
		
//		dist = new ArrayList<HashMap<String, Integer>>(map.values());
		path = new HashMap<String, String>();
		prev = new ArrayList<String>();
		visited = new HashMap<String, Boolean>();
		this.startNode = startNode;
		currentNode = startNode;
		visited.put(startNode, true);
		distanceFromStart = new HashMap<String, Integer>();
	}
	
	public void updateNodes() {
		
	}
	private void updateUnselected() {
		HashMap<String, Integer> surroundingNodes = map.get(currentNode);
		for(int i = 0; i < surroundingNodes.size(); i++) {
			
		}
	}
	/**
	 * Finds the node that is closest to the current node.
	 * 
	 * @return the closest node to the previous node.
	 */
	public String calcMinDist() {
		
		//The nodes surrounding the current one
		Set<String> surroundingNodes = map.get(currentNode).keySet();
		
		//picks an arbitrary minDist from the set of surrounding node distances.
		int minDist = map.get(currentNode).get(surroundingNodes.iterator().next());
		
		String closest = "";
		
		//cycles through and finds the closest node
		for(String node : surroundingNodes) {
			//if this node's distance is less than the known minimum, make it the min.
			if(map.get(currentNode).get(node) < minDist) {
				minDist = map.get(currentNode).get(node);
				closest = node;
			}
		}
		
		return closest;
	}
	
	
	
	public String getStart() {
		return startNode;
	}
	
}