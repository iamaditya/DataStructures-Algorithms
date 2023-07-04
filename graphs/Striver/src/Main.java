import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Adjacency matrix method

        int n =3, m = 3; // n nodes and m edges

        int adj[][] = new int[n+1][m+1]; //take matrix of n+1 and m+1 size


//        n^2 space complexity

//        edge 1 -- 2
        adj[1][2] = 1;
        adj[2][1] = 1;

//        edge 2 -- 3
        adj[2][3] = 1;
        adj[3][2] = 1;

//        edge 1 -- 3
        adj[1][3] = 1;
        adj[3][1] = 1;

        for (int i=0;i<n+1;i++){
            for (int j = 0;j<m+1;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}