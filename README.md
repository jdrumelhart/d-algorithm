Dijkstra's Algorithm Project
by Bert Davies, Eric Liu, and Joseph Rumelhart

Introduction:
The purpose of the Dijkstra's algorithm project was to demonstrate our skills in understanding complex algorithms and implement them in a Java project. Dijkstra's algorithm is a way to find the shortest path between an initial node and all other nodes in a directed or undirected graph. 
	
Specifications:
The Dijkstra class must have a constructor that takes a HashMap that maps a String to another HashMap that maps a String to an Integer. While
this may appear confusing at first, what is happening is that a string, representing a node, is being mapped to all of its surrounding nodes along with the distance between them. The constructor also takes a String, which represents the starting node. It must have a public path, which is a HashMap of a string to a string, representing the sequence of nodes from a specified node to the source node. Additionally, it must have a method called "Next" which takes a String and a Dijkstra object that returns an ArrayList of Strings, representing the shortest path between the specified node and the source of the Dijkstra object.

These specifications were met completely, as our code has a Next() method, the constructor for Dijkstra has a HashMap that maps a String to a HashMap of String to Integers, and a public path.

Fulfillment:
Our code does not entirely fill specifications. The primary problem, however, is not with our code, which does in fact create a graph, but with the Java implementation of HashMap. Due to a known error, accessing some of the vertex values is not possible with the current code, throwing a ClassCastException. While there may be a way around this issue, due to time constraints after the discovery of this bug it was not possible to fix before the submission date. Thus, we are not completely sure of the capability of our code and will endeavor to fix these bugs earlier on subsequent projects.

Overview:
The Dijkstra class uses a priority queue to perform its calculations. We also created the Edge, Graph, and Vertex classes to aid us in our endeavor. The edge class has a start and end point, along with the distance between them. The two points are of type Vertex. The vertex class uses a String to represent its name, and it also keeps track of its neighbors and path. Finally, the graph class consists of both Vertices and Edges, combining both to form a complete representation of the space in which Dijkstra's algorithm operates.

Challenges:
One challenge that we faced in implementing Dijkstra's algorithm was choosing a suitable data structure. Some structures that we took into consideration were HashMaps, LinkedLists, Heaps, and PriorityQueues. While HashMaps were not used in the actual calculations, we met the specifications by converting the inputed HashMap of the constructor into a Graph. LinkedLists and Heaps were taken into consideration for their graph-like structure of connected nodes. This similarity to the data that Dijkstra's algorithm operates on is what led us to consider using these data structures for the project. However, PriorityQueues were deemed superior to both LinkedLists and Heaps for their greater speed and efficiency.
