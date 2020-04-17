class Queue{
    int front, rear, size;
    int MAX;
    int arr[];

    public Queue(int capacity){
        this.MAX = capacity;
        front =0;
        this.size =0;
        this.rear = capacity -1;
        arr = new int[MAX];
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isFull(){
        return (size == rear);
    }

    public void enqueue(int value){
        if(isEmpty()){
            arr[front] = value;
            size = 1;
        }
        else if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            
            arr[size] = value;
            size +=1;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Dequeue is Empty");
        }
        else{
            System.out.println("Item is removed from queue->"+ arr[front]);
            front +=1;
        }

    }

    public void display(){
        for(int i=front;i<size;i++){
            
            System.out.print(arr[i]+ " ");
        }
    }
}

 
class Qmain{
    public static void main(String [] args){
        Queue q = new Queue(100);
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(3);
        //q.display();
        q.dequeue();
        q.enqueue(9);
        q.enqueue(7);
        q.display();
    }

}