class Listnode{
    int data;
    Listnode right;
    Listnode left;

    Listnode(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
public class MaxAndMinElementInBinaryTree {
    public static int findMax(Listnode root){

        if(root==null){
            return Integer.MIN_VALUE;
        }
        else

            return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
    }


    public static int findMin(Listnode root){

        if(root==null){
            return Integer.MAX_VALUE;
        }

        else

            return Math.min(root.data, Math.min(findMin(root.left), findMin(root.right)));
    }
    public static void main(String[] args) {

        Listnode root = new Listnode(2);
        root.left = new Listnode(7);
        root.left.right = new Listnode(6);
        root.left.right.left = new Listnode(1);
        root.left.right.right = new Listnode(11);
        root.right = new Listnode(5);
        root.right.right = new Listnode(9);
        root.right.right.left = new Listnode(4);


        int res_min = findMin(root);
        int res_max = findMax(root);

        System.out.println("The max element is: " + res_max);
        System.out.println("The min element is: " + res_min);


    }
}
