import java.util.ArrayList;

class Node{
    int val;

    Node left;

    Node right;

    Node(int val){
        this.val = val;
    }
}
public class Main {
    static boolean found = false;
    public static boolean findinBT(Node root, int k){
        if(root == null) return false;

        if(root.val == k){
            found = true;
        }else if(root.val > k){
            findinBT(root.left, k);
        }else{
            findinBT(root.right, k);
        }

        return found;
    }


    public static Node addBT(Node root, int val){
        if(root == null) return new Node(val);

        if(root.val > val){
            if(root.left == null){
                 root.left = new Node(val);
            }else{
                addBT(root.left, val);
            }
        }else{
            if(root.right == null)  root.right = new Node(val);
            else addBT(root.right, val);

        }

        return root;

    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+ " ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+ " ");
    }

    public static void delete(Node root, int target){
        if(root == null) return;

        if(root.val > target){
            if(root.left == null){ // node not exists
                return;
            }
            if(root.left.val == target){
                Node l = root.left; // node to be deleted
                if(l.left == null && l.right == null) root.left = null; // 0 child
                else if(l.left == null || l.right == null){ // 1 child
                    if(l.left!= null) root.left = l.left;
                    else root.left = l.right;
                }else {
                    Node cur = l;

                    Node pred = cur.left;
                    while (pred != null) pred = pred.right;

                    delete(root, pred.val);
                    pred.left = cur.left;
//                    cur.left = pred.left;
//                    cur.right = pred.right;
                    pred.right = cur.right;
                    root.left = pred;
                }
            }else delete(root.left, target);
        }else{
            if(root.right == null) return;
            if(root.right.val == target) {
                Node r = root.right; // node to be deleted
                if (r.left == null && r.right == null) root.right = null;
                else if(r.left == null || r.right == null) {
                    if (r.left != null) root.right = r.left;
                    else root.right = r.right;
                }else{
                    Node cur = r;

                    Node pred = cur.left;
                    while (pred != null) pred = pred.right;

                    delete(root, pred.val);
                    pred.left = cur.left;
//                    cur.left = pred.left;
                    pred.right = cur.right;
//                    cur.right = pred.right;
                    root.right = pred;

            }
            }else delete(root.right, target);
        }
    }


    public static void rightView(Node root, ArrayList<Integer> ds, int dep){
        if(root == null) return;

        if(dep == ds.size()){
            ds.add(root.val);
        }

        rightView(root.right, ds, dep+1);
        rightView(root.left, ds, dep+1);
    }

    public static void main(String[] args) {
        Node tree1 = new Node(35);
        Node tree2 = new Node(30);
        Node tree3 = new Node(40);
        Node tree4 = new Node(25);
        Node tree5 = new Node(33);
        Node tree6 = new Node(38);
        Node tree7 = new Node(45);
        tree1.left = tree2;
        tree1.right = tree3;
        tree2.left = tree4;
        tree2.right = tree5;
        tree3.left = tree6;
        tree3.right = tree7;

        int key = 45;
        boolean ans = findinBT(tree1, key );
        System.out.println(ans);
        Node x = addBT(tree1, 12);
        Node y = addBT(tree1, 27);
        System.out.println("PREORDER : ");
        preorder(tree1);
        System.out.println();
        System.out.println("INORDER : ");

        inorder(tree1);

        System.out.println();
        System.out.println("POSTORDER : ");

        postorder(tree1);

        delete(tree1,12);
        delete(tree1,25);
        System.out.println("\nINORDER : ");
        inorder(tree1);
        System.out.println("\nRIGHT VIEW : ");
        ArrayList<Integer> result = new ArrayList<>();
        int depth = 0;
        rightView(tree1,result, depth);
        System.out.println(result);
    }
}