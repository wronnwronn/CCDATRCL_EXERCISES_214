public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 13;
        int noEdges = 13;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "ADIA";
        myGraph.edge[0].dest = "DU";

        // Edge 2
        myGraph.edge[1].src = "ADIA";
        myGraph.edge[1].dest = "PAR";

        // Edge 3
        myGraph.edge[2].src = "ADIA";
        myGraph.edge[2].dest = "REFARIAL";

        // Edge 4
        myGraph.edge[3].src = "ADIA";
        myGraph.edge[3].dest = "DIONIO";

        // Edge 5
        myGraph.edge[4].src = "ADIA";
        myGraph.edge[4].dest = "ESPLANADA";

        // Edge 6
        myGraph.edge[5].src = "ADIA";
        myGraph.edge[5].dest = "HECHANOVA";

        // Edge 7
        myGraph.edge[6].src = "ADIA";
        myGraph.edge[6].dest = "BUSTARDE";

        // Edge 8
        myGraph.edge[7].src = "ADIA";
        myGraph.edge[7].dest = "CAYETANO";

        // Edge 9
        myGraph.edge[8].src = "ADIAA";
        myGraph.edge[8].dest = "COMENDADOR";

        // Edge 10
        myGraph.edge[9].src = "ADIA";
        myGraph.edge[9].dest = "FERRER";

        // Edge 11
        myGraph.edge[10].src = "DU";
        myGraph.edge[10].dest = "PAR";
        // Edge 12
        myGraph.edge[11].src = "DU";
        myGraph.edge[11].dest = "REFARIAL";

        // Edge 13
        myGraph.edge[12].src = "PAR";
        myGraph.edge[12].dest = "HECHANOVA";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
