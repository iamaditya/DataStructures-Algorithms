import java.util.*;
// for un-weighted graph
public class Main {

    static class Edge{
        int src;
        int des;

        Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }


    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0;i<graph.length;i++){
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
        graph[5].add(new Edge(6,5));
    }
    public static void neighbours(ArrayList<Edge> graph[], int v){
        for (int i=0;i<graph[v].size();i++){
            Edge e = graph[v].get(i);

            System.out.println(e.des+" ");
        }
    }

    public static void BFS(ArrayList<Edge> graph[], Boolean vis[],int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(q.size()>0){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;

                for (int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }

    }


    public static void DFS(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.print(curr+" ");

        vis[curr] = true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.des] == false){
                DFS(graph,e.des,vis);
            }
        }
    }


    public static void printallpath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar ){
        if(curr == tar){
            System.out.println(path);
            return;
        }

        for (int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(vis[e.des] == false){
                vis[curr] = true;
                printallpath(graph,vis,e.des,path+e.des,tar);
                vis[curr] = false;
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println("Neighbours of V: 2");

        neighbours(graph,2);
        System.out.println("BFS GRAPH : ");

        Boolean vis[] = new Boolean[V];

        Arrays.fill(vis, false);

        for (int i =0;i<V;i++){
            if(!vis[i]){
                BFS(graph,vis,i);
            }
        }

        System.out.println("DFS GRAPH : ");
        boolean newvis[] = new boolean[V];
        Arrays.fill(newvis,false);

        for (int i=0;i<V;i++){
            if(newvis[i] == false){
                DFS(graph, i, newvis);
            }
        }

        int src = 0, tar = 5;
        System.out.println("\nAll pairs");
        printallpath(graph, new boolean[V], src, "0",tar);

    }
}