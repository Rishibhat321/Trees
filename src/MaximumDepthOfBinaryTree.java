class ListNode3{
    int data;
    ListNode3 right;
    ListNode3 left;

    ListNode3(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class MaximumDepthOfBinaryTree {
    public static int maxDepth(ListNode3 root) {

        if(root==null){
            return 0;
        }

        else

            return (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
    }
    public static void main(String[] args) {
        ListNode3 root = new ListNode3(10);
        root.left = new ListNode3(20);
        root.left.right = new ListNode3(40);
        root.right = new ListNode3(30);
        root.right.right = new ListNode3(60);
        root.right.right.left = new ListNode3(2);

        int res = maxDepth(root);

        System.out.println("The maximum depth of the binary tree is : " + res);


    }
}
