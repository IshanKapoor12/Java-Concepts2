import java.util.ArrayList;

// Graph Traversals -> Visiting the nodes of a graph and printing them.
// BFS -> Breadth First Search -> Go to the immediate neighbours first of the node we are present at before going to the neighbours of the next node.
// BFS is indirect Level Order Traversal.
// Queue is used to perform BFS.
// Vertices are added through he rear and removed through the front.
// A visited array is made to keep a track of the nodes visited to prevent repetition.
// Its size is the no of vertices.
// The array is a boolean array with default values as false.
// Visiting a node:
// 1. Check vis[curr] == false (if true just remove the element from the queue)
// 2. print(curr)
// 3. vis[curr] = true
// 4. curr node neighbours added to the queue.
// Stop the process when the queue is empty.
// T(n) of BFS -> O(V+E)
public class GraphTraversals {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Adjacency List
    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }

    public static void main(String[] args) {
        int V = 7;
        /*
             1 --- 3
            /      | \
           0       |  5 --- 6
            \      | /
             2 --- 4
        */

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        // print 2's neighbours
        for(int i=0;i<graph[1].size();i++) {
            Edge e = graph[1].get(i);
            System.out.println(e.dest + "  ");
        }
    }
}
