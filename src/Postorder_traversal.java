import java.util.*;

class Node2{
    int data;
    Node2 right;
    Node2 left;

    Node2(int d){
        data = d;
        right = left = null;
    }
}

public class Postorder_traversal {
    static void postorder_traversal(Node2 root, ArrayList<Integer> list){

        if(root == null){
            return;
        }

        postorder_traversal(root.left,list);
        postorder_traversal(root.right,list);
        list.add(root.data);
    }

    static ArrayList<Integer> postorder(Node2 root){
        ArrayList<Integer> list = new ArrayList<Integer>();

        postorder_traversal(root,list);

        return list;
    }
    public static void main(String[] args) {
        Node2 root = new Node2(10);
        root.left = new Node2(20);
        root.right = new Node2(30);
        root.right.left = new Node2(40);
        root.right.right = new Node2(50);

        ArrayList<Integer> res = postorder(root);

        System.out.println("The Post-order traversal of the binary tree is: " +  res);


    }
}
