
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
        if(root.left == null && root.right == null){
            return 0;
        }

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

    public static int returnSizeOfTree(xNode root){
        if(root == null){
            return 0;
        }
        return 1 + returnSizeOfTree(root.left)+ returnSizeOfTree(root.right);
    }
    public static void main(String[] args) {
        xNode tree = new xNode(2);
        xNode tree1 = new xNode(5);
        xNode tree2 = new xNode(2);
        xNode tree3 = new xNode(4);
        xNode tree4 = new xNode(2);
        xNode tree5 = new xNode(3);

        tree.left = tree1;
        tree.right = tree2;
        tree1.left = tree3;
        tree1.right = tree5;
        tree2.right = tree4;

        countSize(tree);
        System.out.println(size);
        System.out.println("size : "+returnSizeOfTree(tree));
        System.out.println("SUM of nodes : "+sumofnode(tree));

        System.out.println("Max Value : "+maxValue(tree));

        System.out.println("Height of Tree : "+ height(tree));

        System.out.println("Min Value : "+ minValue(tree));

        System.out.println("Product Of Nodes : "+ Product(tree));
//        sout
    }
}