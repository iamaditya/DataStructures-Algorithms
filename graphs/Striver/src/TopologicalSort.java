import java.util.*;
public class TopologicalSort {
}


class iSolution
{

    public static void dfs(int node, Stack<Integer> st, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;

        for(var x : adj.get(node)){
            if(vis[x] == 0){
                dfs(x, st, vis, adj);
            }
        }
        st.push(node);
    }
    //Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> st = new Stack<>();

        int vis[] = new int[V];
        Arrays.fill(vis, 0);


        for(int i=0;i<V;i++){
            if(vis[i] == 0){
                dfs(i, st, vis, adj);
            }
        }


        int arr[] = new int[V];
        int i =0;
        while(st.size()>0){
            arr[i++] = st.peek();

            st.pop();
        }

        return arr;
    }
}