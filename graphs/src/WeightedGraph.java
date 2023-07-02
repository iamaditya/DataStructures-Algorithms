import java.util.*;
public class WeightedGraph {
static class Edge{
    int src;
    int des;
    int wght;

    Edge(int s, int d, int w){
        this.src = s;
        this.des = d;
        this.wght = w;
    }
}

    public static void creategraph(ArrayList<Edge> graph[], int V){
        for (int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

    graph[0].add(new Edge(0,2,10));
    graph[1].add(new Edge(1,2,9));
    graph[1].add(new Edge(1,3,8));
    graph[2].add(new Edge(2,0,7));
    graph[2].add(new Edge(2,3,6));
    graph[2].add(new Edge(2,1,5));
    graph[3].add(new Edge(3,1,10));
    graph[3].add(new Edge(3,2,10));

    }
    public static void main(String[] args) {
    int V = 4;
    ArrayList<Edge> graph[] = new ArrayList[V];

    creategraph(graph,V);

    }
}
