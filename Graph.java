import java.util.*;
public class Graph{
    private Map<Integer, List<Integer>> adjList;
    private boolean isDirected;
    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        adjList = new HashMap<>();
    }
    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }
    public void addEdge(int src, int dest) {
        addVertex(src);
        addVertex(dest);
        adjList.get(src).add(dest);
        if (!isDirected) {
            adjList.get(dest).add(src);
        }
    }
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (int neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(false); // undirected graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        System.out.print("BFS traversal from node 0: ");
        graph.bfs(0); 
    }
}