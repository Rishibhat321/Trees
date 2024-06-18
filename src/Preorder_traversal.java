import java.util.*;
import java.util.ArrayList;

class Node1{
    int data;
    Node1 right;
    Node1 left;

    Node1(int d){
        data = d;
        right = left = null;
    }
}

public class Preorder_traversal {

    static void preorder_traversal(Node1 root, ArrayList<Integer> list){

        if(root == null){
            return;
        }

        list.add(root.data);
        preorder_traversal(root.left,list);
        preorder_traversal(root.right,list);

    }

    static ArrayList<Integer> preorder(Node1 root){

        ArrayList<Integer> list = new ArrayList<Integer>();

        preorder_traversal(root,list);

        return list;
    }
    public static void main(String[] args) {

        Node1 root = new Node1(10);
        root.left = new Node1(20);
        root.right = new Node1(30);
        root.right.left = new Node1(40);
        root.right.right = new Node1(50);

        ArrayList<Integer> res = preorder(root);

        System.out.print("The Pre-order Traversal of the Binary Tree is : " + res);

    }
}
