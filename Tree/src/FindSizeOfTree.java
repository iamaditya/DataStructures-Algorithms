import java.lang.reflect.Array;
import java.util.*;
class xNode{
    int val;
    xNode left;
    xNode right;

    xNode(int val){
        this.val = val;
    }
}
public class FindSizeOfTree{
    static int size = 0;

    public static void countSize(xNode root){
        if(root!=null){
            size++;
        }else{
            return;
        }

    countSize(root.left);
    countSize(root.right);
    }



    public static int minValue(xNode root){
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = minValue(root.left);
        int c = minValue(root.right);

        return Math.min(a,(Math.min(b,c)));
    }


    public static int Product(xNode root){
        if(root == null) return 1;

        int a = root.val;
        int b = Product(root.left);
        int c = Product(root.right);

        return a*b*c;
    }
    public static int height(xNode root){
        if(root == null) return 0;
//        if(root.left == null && root.right == null){
//            return 0;
//        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int maxValue(xNode root){

        if(root == null){
            return Integer.MIN_VALUE;
        }
        int a = root.val;

        int b = maxValue(root.left);
        int c = maxValue(root.right);

        return Math.max(a,(Math.max(b,c)));
    }
    public static int sumofnode(xNode root){
        if(root == null){
            return 0;
        }

        return root.val+sumofnode(root.left)+sumofnode(root.right);
    }
    public static void postorder(xNode tree){
        if(tree == null) return;

        postorder(tree.left);
        postorder(tree.right);
        System.out.print(tree.val+" ");
    }
    public static void inorder(xNode tree){
        if(tree == null) return;

        inorder(tree.left);
        System.out.print(tree.val+" ");
        inorder(tree.right);
    }
    public static void preorder(xNode tree){
        if(tree == null) return;

        System.out.print(tree.val+" ");
        preorder(tree.left);
        preorder(tree.right);
    }
    public static int returnSizeOfTree(xNode root){
        if(root == null){
            return 0;
        }
        return 1 + returnSizeOfTree(root.left)+ returnSizeOfTree(root.right);
    }


    public static void nthLevel(xNode root, int n){
        if(root == null) return;

        if(n == 1){
            System.out.print(root.val+ " ");
        }

        nthLevel(root.left, n -1);
        nthLevel(root.right , n-1);
    }

    public static void BFS(xNode root){
        Queue<xNode> q1 = new LinkedList<>();

        if(root == null) return;

        q1.add(root);


        while(q1.size()>0){

            // add only if they are not null

            xNode temp = q1.peek();
            if(temp.left!= null) q1.add(temp.left);
            if(temp.right!= null) q1.add(temp.right);
            System.out.print(temp.val+" ");
            q1.remove();
        }
    }


    public static ArrayList<Integer> DFS(xNode root , ArrayList<Integer> arr){
        if(root == null) return arr;

        Stack<xNode> alist = new Stack<>();

        alist.push(root);

        while(alist.size()>0){
            xNode temp = alist.peek();

            if(temp.left!=null){
                alist.push(temp.left);
                temp.left = null; // IMP LINE
            }else{
                alist.pop();
                arr.add(temp.val);
                if(temp.right!=null) alist.push(temp.right);
            }
        }

        return arr;
    }


    public static ArrayList<Integer> DFSPre(xNode root, ArrayList<Integer> arr) {
        if (root == null) return arr;

        Stack<xNode> stack = new Stack<>();
        stack.push(root);

        while (stack.size()>0) {
            xNode temp = stack.pop();
            arr.add(temp.val);

            if (temp.left != null) {
                stack.push(temp.left);
            }

            if (temp.right != null) {
                stack.push(temp.right);
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        xNode tree = new xNode(2);
        xNode tree1 = new xNode(5);
        xNode tree2 = new xNode(2);
        xNode tree3 = new xNode(4);
        xNode tree4 = new xNode(2);
        xNode tree5 = new xNode(3);
        xNode tree6 = new xNode(9);

        tree.left = tree1;
        tree.right = tree2;
        tree1.left = tree3;
        tree1.right = tree5;
        tree2.right = tree4;
        tree2.left = tree6;
        countSize(tree);
        System.out.println(size);
        System.out.println("size : "+returnSizeOfTree(tree));
        System.out.println("SUM of nodes : "+sumofnode(tree));

        System.out.println("Max Value : "+maxValue(tree));

        System.out.println("Height of Tree : "+ height(tree));

        System.out.println("Min Value : "+ minValue(tree));

        System.out.println("Product Of Nodes : "+ Product(tree));
//        sout

        System.out.println("PREORDER : ");
        preorder(tree);
        System.out.println();
        System.out.println("INORDER : ");
        inorder(tree);
        System.out.println();
        System.out.println("POSTORDER : ");
        postorder(tree);
        System.out.println();
        System.out.println("3Rd Level : ");
        nthLevel(tree, 3);

        System.out.println();

        System.out.println("EACH LEVEL BFS ");

        int levels = height(tree);

        for (int i=1;i<=levels;i++){
            nthLevel(tree,i);
            System.out.println();
        }


        System.out.println("BFS Using queue");
        BFS(tree);
        System.out.println();
        System.out.println("DFS using Stack ");
        ArrayList<Integer> a1 = new ArrayList<>();

        a1 = DFS(tree,a1);

        System.out.println(a1);
        System.out.println("DFSPre using Stack ");

        ArrayList<Integer> a2 = new ArrayList<>();

        a2 = DFSPre(tree,a2);

        System.out.println(a2);
    }

}