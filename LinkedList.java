import java.util.*;

class Node{
    int data;
    Node next;
}

class LinkedList{

    Node head;
    Node tail;
    //For insertion in list
    public void insert(int value){
        Node node = new Node();
        node.data = value;
        node.next = null;

        if (head == null){
            head =node;
            tail = node;
        }
        else{
            tail.next = node;
            tail =node;
        }
    }
    //Insertion at begining
    public void insertAtStart(int value){
        Node node =new Node();
        node.data = value;
        node.next = null;

        if (head == null){
            head = node;
        }
        else {
            node.next =head;
            head =node;
        }
    }
    // Insertion at any location
    public void insertAtLocation(int index, int value){
        Node node =new Node();
        node.data = value;
        node.next = null;
        if(index ==0){
            insertAtStart(value);
        }
        else{
        Node n =head;
        for(int i=0; i<index-1;i++){
            System.out.println(i);
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        }
    }
    //deletion at
    public void deletionAt(int index){
        if(index ==0){
            head =head.next;
        }
        else{
            Node n =head;
            Node n1 =null;
            for(int i=0; i<index-1;i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }

    // display of list
    public void show(){
        Node temp = head;
    
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp =temp.next;
        }
    }
}
class Mymain{
    public static void main(String []args){
        LinkedList list = new LinkedList();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of items for list");
        int j = sc.nextInt();
        for(int i =0; i<j;i++){
            System.out.println("Enter the list item ");
            list.insert(sc.nextInt());
        }
        //list.insertAtStart(8);

        list.insertAtLocation(4,666);

        list.show();
    }
}