package tree;

import org.jetbrains.annotations.Contract;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value=value;
        right=null;
        left=null;
    }
}
public class BinaryTree {

    Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public boolean containsValue(int value){
        return containsNodeRecursive(root,value);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    public void DepthFirstSearch(){
        // conclusion is inorder have
        // root is in middle
        // preorder root is in left
        // postorder root is in right
        // inorder left - root - right
        // preorder root - left - right
        // post order - left right root
        System.out.print("In Order : ");
        traverseInOrder(root);
        System.out.println();
        System.out.print("Pre Order : ");
        traversePreOrder(root);
        System.out.println();
        System.out.print("Post Order : ");
        traversePostOrder(root);
        System.out.println();
    }

    public void breadthFirstSearch() {
        System.out.print("Breadth First Search : ");
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        System.out.println();
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }


    @Contract("null, _ -> new")
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    private boolean containsNodeRecursive(Node current,int value){
        if(current==null){
            return false;
        }
        if(value==current.value){
            return true;
        }
        return value<current.value
                ?containsNodeRecursive(current.left,value)
                :containsNodeRecursive(current.right,value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.value=smallestValue;
            current.right=deleteRecursive(current.right,smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        //System.out.println(bt.root.right.value);
//        System.out.println(bt.containsValue(8));
//        bt.delete(8);
//        System.out.println(bt.containsValue(8));
        bt.DepthFirstSearch();
        bt.breadthFirstSearch();
    }
}
