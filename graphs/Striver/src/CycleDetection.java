
import java.util.*;

public class CycleDetection {
    static class Pair{
        int front;
        int second;

        Pair(int front,int second){
            this.front = front;

            this.second = second;
        }
    }
    public static boolean isCycle(int src,int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis){

        vis[src] = true;
        Queue<Pair> q = new LinkedList<Pair>();

        q.add(new Pair(src,-1));
        while (q.size()>0){
            int node = q.peek().front;
            int parent = q.peek().second;
            q.remove();


            for (int x : adj.get(node)){
                if(vis[x] == false){
                    vis[x] = true;
                    q.add(new Pair(x,node));
                }else if(parent!=x){
                    return true;

                }
            }
        }
        return false;
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

        boolean vis[] = new boolean[n+1];
        boolean cycle = false;

        for(int i=0;i<n;i++){
            if(vis[i] == false){
            cycle = isCycle(i,n,adj,vis);
            }
        }

        System.out.println("Is cycle : "+cycle);
    }
}



// Cycle Detection in Directed Graph



class qSolution {
    // Function to detect cycle in a directed graph.



    public static boolean dfs(int node, int[] vis, int[] pathvis, ArrayList<ArrayList<Integer>>adj){

        vis[node] = 1;
        pathvis[node] = 1;

        for(var x : adj.get(node)){
            if(vis[x] == 0){
                if(dfs(x,vis,pathvis,adj) == true) return true;
            }else if(pathvis[x] == 1) return true;
        }

        pathvis[node] = 0;
        return false;

    }


    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];

        int pathvis[] = new int[V];

        Arrays.fill(vis, 0);
        Arrays.fill(pathvis,0);


        for(int i=0;i<V;i++){
            if(vis[i] == 0){
                if(dfs(i, vis, pathvis, adj)== true) return true;
            }
        }

        return false;
    }
}