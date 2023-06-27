
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

        public static int sumofnode(xNode root){
        if(root == null){
            return 0;
        }

        return root.val+sumofnode(root.left)+sumofnode(root.right);
    }
    public static int returnSizeOfTree(xNode root){
        if(root == null){
            return 0;
        }
        return 1 + returnSizeOfTree(root.left)+ returnSizeOfTree(root.right);
    }
    public static void main(String[] args) {
        xNode tree = new xNode(5);

        xNode tree1 = new xNode(6);
        xNode tree2 = new xNode(7);
        xNode tree3 = new xNode(7);
        xNode tree4 = new xNode(7);

        tree.left = tree1;
        tree.right = tree2;
        tree1.left = tree3;
        tree2.right = tree4;

        countSize(tree);
        System.out.println(size);
        System.out.println("size : "+returnSizeOfTree(tree));
        System.out.println("SUM of nodes : "+sumofnode(tree));
    }
}