import java.util.*;
import java.util.Stack;

class ListNode8{
    ListNode8 right;
    ListNode8 left;
    int data;

    ListNode8(int data){
        this.data = data;
    }
}

public class ZigZag_Tree_Traversal {
   public static ArrayList<Integer> zigZagTraversal(ListNode8 root)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(root==null)
        {
            return list;
        }


        Stack<ListNode8> s1 = new Stack<ListNode8>();
        Stack<ListNode8> s2 = new Stack<ListNode8>();

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty())
        {

            while(!s1.isEmpty())
            {
                ListNode8 temp1 = s1.pop();

                list.add(temp1.data);

                if(temp1.left!=null)
                {
                    s2.push(temp1.left);
                }

                if(temp1.right!=null)
                {
                    s2.push(temp1.right);
                }
            }

            while(!s2.isEmpty())
            {
                ListNode8 temp2 = s2.pop();

                list.add(temp2.data);

                if(temp2.right!=null)
                {
                    s1.push(temp2.right);
                }

                if(temp2.left!=null)
                {
                    s1.push(temp2.left);
                }
            }
        }


        return list;


    }

    public static void main(String[] args) {

       ListNode8 root = new ListNode8(7);
       root.left = new ListNode8(9);
       root.right = new ListNode8(7);
       root.right.left = new ListNode8(6);
       root.left.left = new ListNode8(8);
       root.left.right = new ListNode8(8);
       root.left.left.left = new ListNode8(10);
       root.left.left.right = new ListNode8(9);

       ArrayList<Integer> res = zigZagTraversal(root);

        System.out.println(res);

    }
}
