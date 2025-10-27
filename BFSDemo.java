import java.util.LinkedList;
import java.util.Queue;

class Graph {
    private int V;
    private LinkedList<Integer>[] adjList;

    Graph(int vertices) {
        V = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++)
            adjList[i] = new LinkedList<>();
    }

    void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }

    void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class BFSDemo {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("BFS starting from node 0:");
        g.BFS(0);
    }
}