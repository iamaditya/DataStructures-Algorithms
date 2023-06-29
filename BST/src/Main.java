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
        preorder(tree1);
    }
}