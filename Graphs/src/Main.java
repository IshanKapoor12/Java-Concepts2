// Graphs -> Intuitive Data Structure -> Network of nodes
// Where each node -> vertex and connection between 2 nodes -> edge
// graph can be unidirectional (directed) or bidirectional (undirected) depending upon the direction of edges.
// graph can be weighted or unweighted depending upon the weight assigned to the edge.

import java.util.ArrayList;

public class Main {
    static class Edge {
        // src and dest are there for undirected unweighted graph.
        int src;
        int dest;

        // src, dest and wt are there for undirected weighted graph.
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

// Creating a Graph:
// 1. Adjacency List -> List of Lists -> Done vertex-wise (source in the graph same as index in the list)
// 2. Adjacency Matrix -> Rows and columns are the vertices and the elements of the matrix are filled with 1 if there is an edge between the 2 vertices else 0 is added.
// 3. Edge List -> ArrayList of edges (src, dest) OR (src, dest, wt).
// 4. 2D Matrix (Implicit Graph) ->

    // Adjacency List
    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        // print 2's neighbours
        for(int i=0;i<graph[1].size();i++) {
            Edge e = graph[1].get(i);
            System.out.println(e.dest + "  " + e.wt);
        }
    }
}