package algorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra {

	//This is the HashMap that will ultimately be accessed by the interfacing program
	public HashMap<String, String> path;
	
	public ArrayList<Boolean> visited;
	public ArrayList<HashMap<String, Integer>> dist;
	public ArrayList<String> prev;
	public ArrayList<String> nodes;

	public Dijkstra(HashMap<String, HashMap<String, Integer>> map, String name) {
		nodes = new ArrayList<String>(map.keySet());
		dist = new ArrayList<HashMap<String, Integer>>(map.values());
	}
}