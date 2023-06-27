import java.sql.SQLOutput;

class Node{
    int val;
    Node left;
    Node right;

    public Node(int i){
        this.val = i;
    }
}


public class Main {

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void printNode(Node xtree){

        //pre order traversal
        if(xtree == null){
            return;
        }
        System.out.print(xtree.val+" -> ");
        if(xtree.left!=null) System.out.print(xtree.left.val+" ");
        if(xtree.right!=null) System.out.print(xtree.right.val+" ");
        System.out.println();
        printNode(xtree.left);
        printNode(xtree.right);
    }
    public static void main(String[] args) {
      Node tree = new Node(5);
      Node a = new Node(4);
      Node b = new Node(8);

      tree.left = a;
      tree.right = b;
      Node c = new Node(7);
      Node d = new Node(9);

      a.left = c;
      a.right = d;
//        System.out.println(tree.val);
//        System.out.println(tree.left.val);
//        System.out.println(tree.right.val);

        printNode(tree);

        preorder(tree);
    }
}