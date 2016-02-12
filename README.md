Dijkstra's Algorithm Project
by Bert Davies, Eric Liu, and Joseph Rumelhart

Introduction:
The purpose of the Dijkstra's algorithm project was to demonstrate our skills in understanding complex algorithms and implement them in a Java project. Dijkstra's algorithm is a way to find the shortest path between an initial node and all other nodes in a directed or undirected graph. 
	
Specifications:
The Dijkstra class must have a constructor that takes a HashMap that maps a String to another HashMap that maps a String to an Integer. While
this may appear confusing at first, what is happening is that a string, representing a node, is being mapped to all of its surrounding nodes along with the distance between them. The constructor also takes a String, which represents the starting node. It must have a public path, which is a HashMap of a string to a string, representing the sequence of nodes from a specified node to the source node. Additionally, it must have a method called "Next" which takes a String and a Dijkstra object that returns an arraylist of Strings, representing the shortest path between the specified node and the source of the Dijkstra object.

Overview:

Challenges:
