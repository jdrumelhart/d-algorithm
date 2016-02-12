package dijkstra;
import java.util.ArrayList;
import java.util.HashMap;

public interface Shorty {
	
	/**
	 * This meets the specifications of having an interface with the Next() method returning an ArrayList of Strings and has the parameters
	 * of a String and a Dijkstra object.
	 * 
	 * @param name the name of the destination node
	 * @param d the Dijkstra object used which will provide a Graph and the source node.
	 * @return the shortest path from the source node to the destination one.
	 */
	public static ArrayList<String> Next(String name, Dijkstra d) {
		HashMap<String,String> map = d.path;
		ArrayList<String> s = new ArrayList<String>();
		String g = name;
		do {
			g = map.get(g);
			s.add(g);
		}
		while(map.containsValue(g));
		return s;
	}
}
