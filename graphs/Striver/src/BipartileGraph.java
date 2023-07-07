
import java.util.*;

public class BipartileGraph {

    public static void main(String[] args) {
    //code for Bipartile Graph added

//        no 2 adjacent node can have same color

//    using BFS using queue
    }

}

class Solution

{

    public static boolean bipDFS(int node, int col, int[] color, ArrayList<ArrayList<Integer>> adj ){

        color[node] = col;

        for(var x : adj.get(node)){
            if(color[x] == -1){
                if(bipDFS(x,1-col,color,adj) == false) return false;
            }else if(color[x] == color[node]){
                return false;
            }
        }

        return true;
    }

    // using BFS
    public static boolean bip(int node, ArrayList<ArrayList<Integer>> adj, int[] color){

        color[node] = 0;

        Queue<Integer> q = new LinkedList<Integer>();

        q.add(node);

        while(q.size()>0){
            int newnode = q.remove();

            for(var x : adj.get(newnode)){
                if(color[x] == -1){
                    color[x] = 1 - color[newnode];
                    q.add(x);
                }else if(color[x] == color[newnode]){
                    return false;
                }
            }
        }

        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int color[] = new int[V];

        Arrays.fill(color,-1);

//         using BFS (Breath First Search)
         for(int i=0;i<V;i++){
             if(color[i] == -1){
                 if(bip(i,adj, color) == false) return false;
             }
         }

        // using DFS (Depth First Search)
        for(int i=0;i<V;i++){
            if(color[i] == -1){
                if(bipDFS(i, 0,color, adj) == false) return false;
            }
        }

        return true;
    }
}