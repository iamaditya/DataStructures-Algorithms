
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
