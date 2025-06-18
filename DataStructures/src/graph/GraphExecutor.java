package graph;

public class GraphExecutor {
    public static void main(String[] args) {
        CustomGraph graph = new CustomGraph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("C","B");

        graph.printGraph();

        graph.removeEdge("A","B");

        graph.printGraph();
    }
}
