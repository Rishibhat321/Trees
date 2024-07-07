import java.util.LinkedList;
import java.util.Queue;

class ListNode4{
    int data;
    ListNode4 right;
    ListNode4 left;

    ListNode4(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class SumOfBinaryTree {
    public static int sumBT(ListNode4 head){

        int sum = 0;

        if(head==null){
            return 0;
        }

        Queue<ListNode4> q = new LinkedList<ListNode4>();

        q.offer(head);

        while(!q.isEmpty()){
           ListNode4 curr = q.poll();
            sum += curr.data;

            if(curr.left!=null){
                q.offer(curr.left);
            }

            if(curr.right!=null){
                q.offer(curr.right);
            }

        }

        return sum;
    }
    public static void main(String[] args) {

        ListNode4 head  = new ListNode4(10);
        head.left = new ListNode4(20);
        head.left.right = new ListNode4(50);
        head.left.left = new ListNode4(40);
        head.right = new ListNode4(30);
        head.right.right = new ListNode4(70);

        int res = sumBT(head);

        System.out.println("The sum of all the nodes in Binary Tree is: " + res);

    }
}
