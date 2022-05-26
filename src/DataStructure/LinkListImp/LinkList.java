package DataStructure.LinkListImp;

public class LinkList {

    Node head;

    static class Node{

        int data;
        Node next;

        Node(int d){

            data=d;
            next=null;
        }
    }

    public static LinkList insert(LinkList list, int data){

        Node new_node=new Node(data);
        new_node.next=null;

        //If LinkList is empty
        // then make a new node as head

        if(list.head==null){
            list.head=new_node;
        }
        else{
            //Else traverse till the last node
            // and insert the new node there

            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }

            //insert the new node at the last

            last.next=new_node;
        }
        return list;
    }

    public static void printList(LinkList list){

        Node currNode=list.head;

        System.out.println("LinkList: ");

        //Traverse through the Linklist

        while(currNode!=null){
            //print the current Node

            System.out.print(currNode.data + " ");

            currNode=currNode.next;
        }
    }

    public static void main(String[] args) {

        LinkList list=new LinkList();

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);

    }

}

