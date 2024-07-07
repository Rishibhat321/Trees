
class ListNode1{
    int data;
    ListNode1 right;
    ListNode1 left;

    ListNode1(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
public class HeightOfBinaryTree {

    public static int height(ListNode1 node)
    {
        if(node==null){
            return 0;
        }

        return Math.max(height(node.left),height(node.right))+1;
    }
    public static void main(String[] args) {

        ListNode1 root = new ListNode1(10);
        root.left = new ListNode1(15);
        root.left.left = new ListNode1(30);
        root.right = new ListNode1(20);
        root.right.right = new ListNode1(50);
        root.right.left = new ListNode1(40);
        root.right.left.left = new ListNode1(60);
        root.right.left.right = new ListNode1(70);
        root.right.left.left.left = new ListNode1(100);

        int res = height(root);

        System.out.println("The height of the Binary Tree is: " + res);

    }
}
