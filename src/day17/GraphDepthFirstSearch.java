package day17;
import java.util.*;

class GraphDepthFirstSearch {
    private LinkedList<Integer> adj[];

    GraphDepthFirstSearch(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[adj.length];
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
    	GraphDepthFirstSearch g = new GraphDepthFirstSearch(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        System.out.print("DFS starting from node 0: ");
        g.DFS(0); // Output: 0 1 3 4 2
    }
}
