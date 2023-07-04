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
    public static void main(String[] args) {
        int n = 3, m = 3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

//        formula - > edge u -- v adj.get(u).add(v) && adj.get(v).add(u); for undirected graph

//        edge 1 --- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

//        edge 2 -- 3

        adj.get(2).add(3);
        adj.get(3).add(2);

//        edge 1 -- 3

        adj.get(1).add(3);
        adj.get(3).add(1);
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

        System.out.println("BFS of graph : ");
        bfs(adj,n);
    }

}
