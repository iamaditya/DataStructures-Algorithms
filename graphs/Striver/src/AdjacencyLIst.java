import java.sql.SQLOutput;
import java.util.*;

public class AdjacencyLIst {

    public static void bfs(ArrayList<ArrayList<Integer>> adj, int V){
        boolean vis[] = new boolean[V+1];
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        vis[1] = true;
        while(q1.size()>0){
            int ele = q1.remove();
            System.out.print(ele+ " ");

            for (int x : adj.get(ele)){
                if(vis[x] == false){
                    vis[x] = true;
                    q1.add(x);
                }
            }
        }

    }

    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        System.out.print(node+" ");

        for (var x : adj.get(node)){
            if(vis[x] == false){
                dfs(x,vis,adj);
            }
        }
    }
    public static void main(String[] args) {
        int n = 9, m = 9;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

//        formula - > edge u -- v adj.get(u).add(v) && adj.get(v).add(u); for undirected graph

//        edge 1 --- 2
        adj.get(1).add(2);
        adj.get(1).add(6);
        adj.get(2).add(1);
        adj.get(6).add(1);
        adj.get(6).add(7);
        adj.get(6).add(9);
        adj.get(9).add(6);
        adj.get(7).add(6);

//        edge 2 -- 3

        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(4).add(2);
        adj.get(5).add(4);
        adj.get(4).add(5);
        adj.get(5).add(8);
        adj.get(8).add(5);
        adj.get(8).add(7);
        adj.get(7).add(8);
        adj.get(3).add(2);

//        edge 1 -- 3


        System.out.println("UNDIRECTED GRAPH : ");
        for (int i=1;i<=n;i++){
            for (int j=0;j<adj.get(i).size();j++){
                System.out.println("for node "+ i+ " : "+ adj.get(i).get(j));
            }
            System.out.println();
        }




//        for directed graph

        ArrayList<ArrayList<Integer>> directed = new ArrayList<ArrayList<Integer>>();
    for (int i = 0;i<n+1;i++){
        directed.add(new ArrayList<Integer>());
    }
//        forumula -> edge u --v  directed.get(u).add(v);
        directed.get(1).add(2);
        directed.get(2).add(3);
        directed.get(3).add(1);

        System.out.println("DIRECTED GRAPH : ");
        for (int i=0;i<=n;i++){
            for (int j=0;j<directed.get(i).size();j++){
                System.out.println("for node "+i+" : "+directed.get(i).get(j));
            }
            System.out.println();
        }

        System.out.println("BFS of Graph : ");
        bfs(adj,n);

        int node = 1;
        boolean vis[] = new boolean[n+1];

        System.out.println("\nDFS of Graph : ");
        dfs(node, vis, adj);
    }

}
