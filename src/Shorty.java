import java.util.ArrayList;
import java.util.HashMap;

public interface Shorty {
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
