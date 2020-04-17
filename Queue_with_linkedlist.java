class QLL{
    
    class Node{
        int data;
        Node next;
    }
    Node front,rear = null;

    
    public void enqueue(int value){

        Node node = new Node();

        if(front == null){

            node.data= value;
            node.next = null;
            front = rear = node;
            

        }
        else{
            node.data = value;
            rear.next = node;
            rear = node;
        }
        
    }

    public void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        
        Node temp = front;
        front = temp.next;
    
    }

    public void display(){

        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + "<-");
            temp = temp.next;
        }
    }
}

class Mymain{
    public static void main(String []args){
        QLL q= new QLL();
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(6);
        q.display();
    }
}