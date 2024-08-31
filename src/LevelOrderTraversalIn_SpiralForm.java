import java.util.Stack;
import java.util.*;

class ListNode7{
    int data;
    ListNode7 right;
    ListNode7 left;

    ListNode7(int data){
        this.data = data;
    }
}

public class LevelOrderTraversalIn_SpiralForm {

    public static void spiralTraversal(ListNode7 root, ArrayList<Integer> list)
    {

        Stack<ListNode7> s1 = new Stack<ListNode7>();
        Stack<ListNode7> s2 = new Stack<ListNode7>();

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                ListNode7 temp1 = s1.pop();

                list.add(temp1.data);

                if(temp1.right!=null)
                {
                    s2.push(temp1.right);
                }

                if(temp1.left!=null){
                    s2.push(temp1.left);
                }
            }

            while(!s2.isEmpty()){

                ListNode7 temp2 = s2.pop();
                list.add(temp2.data);

                if(temp2.left!=null)
                {
                    s1.push(temp2.left);
                }

                if(temp2.right!=null)
                {
                    s1.push(temp2.right);
                }
            }
        }

    }

   public static ArrayList<Integer> findSpiral(ListNode7 root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        spiralTraversal(root,list);

        return list;
    }

    public static void main(String[] args) {

        ListNode7 root = new ListNode7(1);
        root.left = new ListNode7(2);
        root.right = new ListNode7(3);
        root.left.left = new ListNode7(7);
        root.left.right =new ListNode7(6);
        root.right.left = new ListNode7(5);
        root.right.right = new ListNode7(4);

        ArrayList<Integer> res = findSpiral(root);

        System.out.println(res);


    }
}