package selfPracticeTree;

class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value=value;
    }
}

public class BinaryTree {

    Node root;

    public void add(int value){
        root=addRec(root,value);
    }
    public void printDepthFirstSearch(){
        //
    }
/*
        5 -- current null--current new node
        5

        4 -- current not null -- current left
        current left-current left null - new node
        5
     4     -- again return mail current 5

 */


    private Node addRec(Node current,int value){
        if(current==null){
            current=new Node(value);
            return current;
        }
        if(current.value<value){
            addRec(current.left,value);
        }
        if(current.value>value){
            addRec(current.right,value);
        }
        return current;
    }


    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.add(5);
        bt.add(4);
        bt.add(6);

        System.out.println(bt.root.value);
    }
}
