package run;

import java.util.ArrayList;
import java.util.HashMap;

import algorithm.Dijkstra;
import algorithm.Shorty;

public class Run {

	public static void main(String[] args) {
		

	}
	
	private void play(){


		String[] nodes = {"G","H","D"};

		HashMap distanceGraph;

		distanceGraph = new HashMap<>();

		// Node initialization to be encapsulated.
		String startNode = "G";
		HashMap Gconnections;
		Gconnections = new HashMap();

		String nodeH = "H";
		HashMap Hconnections;
		Hconnections = new HashMap();

		String nodeD = "D";
		HashMap Dconnections;
		Dconnections = new HashMap();

		Gconnections.put(nodeH, 3);
		Gconnections.put(nodeD, 2);

		distanceGraph.put(startNode, Gconnections);
		distanceGraph.put(nodeH, Hconnections);
		distanceGraph.put(nodeD, Dconnections);
		// required!
		Dijkstra myD = new Dijkstra(distanceGraph, startNode);

		String nodepriortoHinpathfromGtoH = myD.prev.get(myD.nodes.indexOf("H"));

		ArrayList path = Shorty.next("H", myD);
		// path should be ["G","H"] 



		ArrayList myPath = new ArrayList();
		ArrayList myPathfromnp = new ArrayList();
		String nodeInPath = "B";
		myPath.add(nodeInPath);
}

}
