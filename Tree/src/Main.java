
class Node{
    int val;
    Node left;
    Node right;

    public Node(int i){
        this.val = i;
    }
}


public class Main {

    public static void printNode(Node xtree){
        if(xtree == null)
        System.out.println(xtree.val);
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
    }
}