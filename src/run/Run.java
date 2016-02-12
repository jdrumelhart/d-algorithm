package run;
import java.util.ArrayList;

import java.util.HashMap;

import dijkstra.Dijkstra;

public class Run {
	
	public static void main(String[] args) {
		
	 HashMap<String, ArrayList<String>> adjacencies;
	 HashMap<String, HashMap<String, Integer>> nodeDistances;
		// Create a graph like on the board:
		// A to b and c
		// B to nothinb
		// c to a.
		nodeDistances = new HashMap<String, HashMap<String, Integer>>();
		adjacencies = new HashMap<String, ArrayList<String>>();
		ArrayList<String> BC = new ArrayList<String>();
		BC.add("B");
		BC.add("C");
		ArrayList<String> AList = new ArrayList<String>();
		AList.add("A");
		adjacencies.put("A", BC);
		adjacencies.put("B", null);
		adjacencies.put("C", AList);
		// What is the set of nodes connected from A?
		
		//System.out.println(threeNodes.adjacencies.get("A"));
		// we would like to be able to set the distance between two nodes 
		// that are linked....
		HashMap<String, Integer> nodeAdistances = new HashMap<String,Integer>();
		HashMap<String, Integer> nodeBdistances = new HashMap<String,Integer>();
		HashMap<String, Integer> nodeCdistances = new HashMap<String,Integer>();
		nodeAdistances.put("B",  3);
		nodeAdistances.put("C",  1);
		nodeCdistances.put("B",  1);
		nodeCdistances.put("A",  4);
	    nodeDistances.put("A", nodeAdistances);
	    nodeDistances.put("B", nodeBdistances);
	    nodeDistances.put("C", nodeCdistances);
		Dijkstra d = new Dijkstra(nodeDistances, "A");
	}
}