package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomGraph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if(!adjList.containsKey(vertex)) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if(adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if(adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if(adjList.containsKey(vertex)) {
            adjList.get(vertex).forEach(value -> adjList.get(value).remove(vertex));
            adjList.remove(vertex);
            return true;
        }
        return false;
    }
}
