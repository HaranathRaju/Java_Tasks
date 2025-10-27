import java.util.LinkedList;
class GraphDFS {
    private int V;
    private LinkedList<Integer>[] adjList;

    GraphDFS(int vertices) {
        V = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++)
            adjList[i] = new LinkedList<>();
    }

    void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }

    void DFSUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor])
                DFSUtil(neighbor, visited);
        }
    }

    void DFS(int start) {
        boolean[] visited = new boolean[V];
        DFSUtil(start, visited);
    }
}

public class DFSDemo {
    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("DFS starting from node 0:");
        g.DFS(0);
    }
}