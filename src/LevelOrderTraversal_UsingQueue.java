
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class ListNode{
    int data;
    ListNode right;
    ListNode left;

    ListNode(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
public class LevelOrderTraversal_UsingQueue {

    public static void level_traversal(ListNode root, ArrayList<Integer> list){

        if(root==null){
            return;
        }

        Queue<ListNode> q = new LinkedList<ListNode>();
        q.offer(root);

        while(!q.isEmpty()){
            ListNode curr = q.poll();
            list.add(curr.data);

            if(curr.left!=null){
                q.offer(curr.left);
            }

            if(curr.right!=null){
                q.offer(curr.right);
            }
        }


    }
    public static ArrayList<Integer> levelOrder(ListNode root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        level_traversal(root,list);

        return list;
    }


    public static void main(String[] args) {
        ListNode root = new ListNode(10);
         root.left = new ListNode(15);
         root.left.left = new ListNode(30);
         root.right = new ListNode(20);
         root.right.right = new ListNode(50);
         root.right.left = new ListNode(40);
         root.right.left.left = new ListNode(60);
         root.right.left.right = new ListNode(70);

         ArrayList<Integer> res =  levelOrder(root);

        System.out.println(res);

    }
}
