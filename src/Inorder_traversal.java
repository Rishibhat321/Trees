import java.util.*;
import java.util.ArrayList;

class Node{
    int data;
    Node right;
    Node left;

    Node(int d){
        data = d;
        right = left = null;
    }
}
public class Inorder_traversal {

    static void inorder_traversal(Node root, ArrayList<Integer> list){

        if(root == null){
            return;
        }

        inorder_traversal(root.left, list);
        list.add(root.data);
        inorder_traversal(root.right,list);
    }

    static ArrayList<Integer> inorder(Node root){
        ArrayList<Integer> list = new ArrayList<Integer>();

        inorder_traversal(root,list);
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left =new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        ArrayList<Integer>  res =  inorder(root);

        System.out.println(res);




    }
}
