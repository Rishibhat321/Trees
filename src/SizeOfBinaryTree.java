class ListNode2{
    int data;
    ListNode2 right;
    ListNode2 left;

    ListNode2(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
public class SizeOfBinaryTree {
    public static int getSize(ListNode2 node) {

        if(node==null){
            return 0;
        }

        else
            return (1 + getSize(node.left) + getSize(node.right));
    }
    public static void main(String[] args) {

        ListNode2 root  = new ListNode2(10);
        root.left = new ListNode2(20);
        root.left.left = new ListNode2(40);
        root.left.right = new ListNode2(50);
        root.right = new ListNode2(30);
        root.right.right = new ListNode2(70);
        root.right.right.right = new ListNode2(80);


        int res = getSize(root);

        System.out.println("The size of the binary tree is : " + res);

    }
}
